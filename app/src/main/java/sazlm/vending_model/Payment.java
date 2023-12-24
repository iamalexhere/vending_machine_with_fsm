/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sazlm.vending_model;

/**
 *
 * @author ialex
 */

public class Payment {
    private int balance;
    private int totalPayment;

    public Payment() {
        balance = 0;
        totalPayment = 0;
    }

    public void addPayment(int amount) {
        balance += amount;
    }

    public void setTotalPayment(int totalPrice) {
        totalPayment = totalPrice;
    }

    public boolean isPaymentComplete() {
        return balance >= totalPayment;
    }

    public void completePayment() {
        balance -= totalPayment;
    }

    public int getBalance() {
        return balance;
    }

    public int getTotalPayment() {
        return totalPayment;
    }
}
