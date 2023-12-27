/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Machine to edit this template
 */
/*
 * The Machine class represents the core vending machine system.
 * It manages product selection, transaction handling, inventory, and payment processing.
 * This class orchestrates various actions and states to facilitate vending operations.
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
    
    //Constructor
    public Machine() {
        currentState = State.IDLE;
        inventory = new Inventory();
        selectedProduct = Product.NONE;
        selectedQuantity = 0;
        payment = new Payment();
    }
    
    /**
     * Allows the user to select a product by its name.
     * Sets the selectedProduct field based on the productName parameter.
     * Updates the currentState based on the selection and the current state of the system.
     */
    public void selectProduct(String productName) {
        selectedProduct = Product.getProduct(productName);

        if (currentState == State.IDLE && selectedProduct != Product.NONE) {
            currentState = State.PRODUCT_SELECTION;
        } else {
            cancelTransaction();
        }
    }
    
    /**
     * Allows the user to select a quantity for the previously chosen product.
     * Validates if the selected quantity is available in the inventory for the chosen product.
     * Updates the selectedQuantity and currentState based on the provided quantity and the system's state.
     */
    public void selectQuantity(int quantity) {
        if (currentState == State.PRODUCT_SELECTION && inventory.isProductAvailable(selectedProduct, quantity)) {
            selectedQuantity = quantity;
            currentState = State.PAYMENT_PENDING;
        } else {
            cancelTransaction();
        }
    }

    /**
    * Processes the payment amount based on the selected payment method.
    * Updates the balance and handles payment based on the provided paymentAmount and paymentMethod.
    * Updates the currentState according to the payment method and the system's current state.
    */
    public void processPayment(int paymentAmount, String paymentMethod) {
        balance = balance + paymentAmount;
        if (currentState == State.PAYMENT_PENDING) {
            if(paymentMethod.equals("cash")){
                int totalPrice = selectedProduct.getPrice() * selectedQuantity;
                totalPayment = totalPrice;

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
    
    /**
    * Completes the transaction if the payment is successfully processed.
    * Updates the inventory stock, displays transaction details, and resets the transaction state.
    * Changes the system's currentState to IDLE upon successful completion.
    *
    * @param selectedProduct  The product that was selected for the transaction.
    * @param selectedQuantity The quantity of the selected product for the transaction.
    */
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
    
    /**
    * Checks the balance status and transitions the system's state accordingly.
    * If in BALANCE_CHECK state, proceeds based on payment completion status:
    * - If payment is incomplete, sets currentState to PAYMENT_PENDING.
    * - If payment is complete, finalizes payment and sets currentState to PAYMENT_COMPLETE.
    * Cancels the transaction if currentState is not BALANCE_CHECK.
    */
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
    
    /**
    * Cancels the ongoing transaction by resetting transaction-related variables
    * and setting the system's currentState to IDLE.
    * Displays a message indicating that the transaction has been canceled.
    */
    public void cancelTransaction() {
        resetTransaction();
        currentState = State.IDLE;
        System.out.println("Transaction canceled.");
    }
    
    /**
    * Resets the system's currentState to IDLE.
    * Changes the system state to the default IDLE state.
    */
    public void resetState(){
        currentState = State.IDLE;
    }
    
    /**
    * Resets the transaction-related variables to their default values.
    * Sets the selectedProduct to NONE, selectedQuantity to 0, and totalPayment to 0.
    */ 
    private void resetTransaction() {
        selectedProduct = Product.NONE;
        selectedQuantity = 0;
        totalPayment = 0;
    }
    
    /**
    * Retrieves the current state of the system.
    *
    * @return The current State enum representing the system's current state.
    */
    public State getCurrentState() {
        return currentState;
    }
    
    /**
    * Retrieves the quantity of the currently selected product.
    *
    * @return The selected quantity of the product in the transaction.
    */
    public int getSelectedQuantity() {
        return selectedQuantity;
    }
       
    /**
    * Retrieves the product of the currently selected product.
    *
    * @return The selected product of the product in the transaction.
    */
    public Product getSelectedProduct() {
        return selectedProduct;
    }
    
    /**
    * Retrieves the remaining stock of the currently selected product.
    *
    * @return The selected remaining stock of the product in the transaction.
    */
    public int getRemainingStock(Product product) {
        return inventory.getStock(product);
    }
    
    /**
    * Displays the remaining stock of the given product.
    *
    * @param product The product to check the remaining stock for.
    */
    private void displayRemainingStock(Product product) {
        int remainingStock = getRemainingStock(product);
        System.out.println("Remaining stock of " + product + ": " + remainingStock);
        System.out.println(this.getCurrentState().name());
    }
    
    /**
    * Displays the remaining balance available for the transaction.
    * Prints the current remaining balance to the console.
    */
    private void displayBalance(){
        System.out.println("Remaining balance: " + getRemainingBalance());
    }
    
    /**
    * Retrieves the remaining balance available for the transaction.
    *
    * @return The remaining balance to be utilized for the transaction.
    */
    public int getRemainingBalance() {
        return payment.getBalance();
    }
    
    /**
    * Retrieves the total payment made for the current transaction.
    *
    * @return The total amount paid for the current transaction.
    */
    public int getTotalPayment() {
        return payment.getTotalPayment();
    }
    
}
