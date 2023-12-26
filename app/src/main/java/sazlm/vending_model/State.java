/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sazlm.vending_model;
/*
 * The State enum represents different states within the vending machine system.
 * It defines various states such as idle, product selection, payment pending, payment completion, and balance check.
 */
/**
 *
 * @author ialex
 */

/**
 * Represents different states within the vending machine system.
 */
public enum State {
    IDLE,
    PRODUCT_SELECTION,
    //QUANTITY_SELECTION,
    PAYMENT_PENDING,
    PAYMENT_COMPLETE,
    BALANCE_CHECK,
    //PRODUCT_SOLD_OUT;
}
