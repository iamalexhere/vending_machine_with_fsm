/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sazlm.vending_view;

/**
 *
 * @author ialex
 */
import java.util.Scanner;

public class TerminalView {
    private Scanner scanner;

    public TerminalView() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Select Product");
        System.out.println("2. Select Quantity");
        System.out.println("3. Process Payment");
        System.out.println("4. Complete Transaction");
        System.out.println("5. Check Balance");
        System.out.println("6. Cancel Transaction");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }
    
    public int getChoiceInput() {
        return scanner.nextInt();
    }
    
    public void consumeNewLine(){
        scanner.nextLine();
    }

    public String getProductNameInput() {
        System.out.print("Enter the product name: ");
        return scanner.nextLine().toUpperCase();
    }

    public int getQuantityInput() {
        System.out.print("Enter the quantity: ");
        return scanner.nextInt();
    }

    public int getPaymentAmountInput() {
        System.out.print("Enter the payment amount: ");
        return scanner.nextInt();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayCurrentState(String currentState, String selectedProduct, int selectedQuantity) {
        System.out.println("\nCurrent State: " + currentState);
        System.out.println("Selected Product: " + selectedProduct);
        System.out.println("Selected Quantity: " + selectedQuantity);
    }

    public void displayRemainingStock(String product, int remainingStock) {
        System.out.println("Remaining stock of " + product + ": " + remainingStock);
    }
}
