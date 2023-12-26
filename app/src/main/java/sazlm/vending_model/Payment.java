/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * The Payment class manages payment-related functionalities for transactions within the vending machine system.
 * It handles the balance, total payment amount, payment addition, completion, and checks for payment completeness.
 */
package sazlm.vending_model;

/**
 * Manages payment-related functionalities for transactions within the vending machine system.
 *
  @author ialex 
 */

public class Payment {
    private int balance;        // Represents the current balance available for transactions
    private int totalPayment;   // Represents the total amount to be paid for a transaction

    /**
     * Constructor for the Payment class, initializing the balance and totalPayment to zero.
     */
    public Payment() {
        balance = 0;
        totalPayment = 0;
    }

    /**
     * Adds an amount to the current balance.
     *
     * @param amount The amount to be added to the balance.
     */
    public void addPayment(int amount) {
        balance += amount;
    }

    /**
     * Sets the total payment amount required for the transaction.
     *
     * @param totalPrice The total amount to be set as the payment.
     */
    public void setTotalPayment(int totalPrice) {
        totalPayment = totalPrice;
    }

    /**
     * Checks if the payment is complete by comparing the balance with the total payment.
     *
     * @return True if the payment is completed, otherwise false.
     */
    public boolean isPaymentComplete() {
        return balance >= totalPayment;
    }

    /**
     * Completes the payment by deducting the total payment from the balance.
     */
    public void completePayment() {
        balance -= totalPayment;
    }

    /**
     * Retrieves the current balance available for transactions.
     *
     * @return The current balance.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Retrieves the total payment amount for the transaction.
     *
     * @return The total payment amount.
     */
    public int getTotalPayment() {
        return totalPayment;
    }
}
