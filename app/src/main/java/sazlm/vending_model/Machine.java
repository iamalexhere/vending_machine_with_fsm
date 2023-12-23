/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Machine to edit this template
 */
package sazlm.vending_model;

/**
 *
 * @author ialex
 */
public class Machine {
    private State currentState;
    private Inventory inventory;
    private Product selectedProduct;
    private int selectedQuantity;
    private int balance;
    private int totalPayment;

    public Machine() {
        currentState = State.IDLE;
        inventory = new Inventory();
        selectedProduct = Product.NONE;
        selectedQuantity = 0;
        totalPayment = 0;
        balance = 0 ;
    }

    public void selectProduct(String productName) {
        selectedProduct = Product.getProduct(productName);

        if (currentState == State.IDLE && selectedProduct != Product.NONE) {
            currentState = State.PRODUCT_SELECTION;
        } else {
            cancelTransaction();
        }
    }

    public void selectQuantity(int quantity) {
        if (currentState == State.PRODUCT_SELECTION && inventory.isProductAvailable(selectedProduct, quantity)) {
            selectedQuantity = quantity;
            currentState = State.PAYMENT_PENDING;
        } else {
            cancelTransaction();
        }
    }

    public void processPayment(int paymentAmount) {
        balance = balance + paymentAmount;
        if (currentState == State.PAYMENT_PENDING) {
            int totalPrice = selectedProduct.getPrice() * selectedQuantity;
            totalPayment = totalPrice;
            currentState = State.BALANCE_CHECK;
        } else {
            cancelTransaction();
        }
    }

    public void completeTransaction() {
        if (currentState == State.PAYMENT_COMPLETE) {
            inventory.updateStock(selectedProduct, selectedQuantity);
            System.out.println("Transaction complete. Product dispensed.");
            displayRemainingStock(selectedProduct);
            displayBalance();
            resetTransaction();
            currentState = State.IDLE;
        } else {
            cancelTransaction();
        }
    }

    public void checkBalance() {
        if (currentState == State.BALANCE_CHECK) {
            if(balance < totalPayment){
                currentState = State.PAYMENT_PENDING;
            } else if(balance >= totalPayment){
                balance = balance - totalPayment;
                currentState = State.PAYMENT_COMPLETE;
            }
        } else {
            cancelTransaction();
        }
    }

    public void cancelTransaction() {
        resetTransaction();
        currentState = State.IDLE;
        System.out.println("Transaction canceled.");
    }

    private void resetTransaction() {
        selectedProduct = Product.NONE;
        selectedQuantity = 0;
        totalPayment = 0;
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getSelectedQuantity() {
        return selectedQuantity;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }
    
    public int getRemainingStock(Product product) {
        return inventory.getStock(product);
    }
    
    private void displayRemainingStock(Product product) {
        int remainingStock = getRemainingStock(product);
        System.out.println("Remaining stock of " + product + ": " + remainingStock);
    }
    
    private void displayBalance(){
        System.out.println("Remaining balance: " + balance);
    }


}
