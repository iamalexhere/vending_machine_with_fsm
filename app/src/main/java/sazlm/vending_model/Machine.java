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
    private Payment payment;

    public Machine() {
        currentState = State.IDLE;
        inventory = new Inventory();
        selectedProduct = Product.NONE;
        selectedQuantity = 0;
        payment = new Payment(); // Initialize Payment object
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

    
    public void processPayment(int paymentAmount, String paymentMethod) {
        balance = balance + paymentAmount;
        if (currentState == State.PAYMENT_PENDING) {
            if(paymentMethod.equals("cash")){
                int totalPrice = selectedProduct.getPrice() * selectedQuantity;
                totalPayment = totalPrice;

                // Update Payment object
                payment.addPayment(paymentAmount);
                payment.setTotalPayment(totalPayment);
                currentState = State.BALANCE_CHECK;
            } else if(paymentMethod.equals("QRIS")){
                //show QR here
                currentState = State.PAYMENT_COMPLETE;
            }
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
            if (!payment.isPaymentComplete()) {
                currentState = State.PAYMENT_PENDING;
            } else {
                payment.completePayment();
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
    
    public void resetState(){
        currentState = State.IDLE;
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
        System.out.println("Remaining balance: " + getRemainingBalance());
    }
    
    public int getRemainingBalance() {
        return payment.getBalance();
    }

    public int getTotalPayment() {
        return payment.getTotalPayment();
    }
    
}
