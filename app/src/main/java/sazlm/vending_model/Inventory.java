/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * The Inventory class represents an inventory management system for handling product stock.
 * It manages the available quantities of various products and provides methods to interact with the inventory.
 */
package sazlm.vending_model;

/**
 *
 * @author ialex
 */
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Product, Integer> productStock;
    
    //Konstruktor Kelas
    public Inventory() {
        productStock = new HashMap<>();
        initializeInventory();
    }
    
    //method to initialize the inventory with 5 product each
    private void initializeInventory() {
        for (Product product : Product.values()) {
            productStock.put(product, 5); // Initialize each product with 5 quantity
        }
    }
    
    //getter for a prodcut stock
    public int getStock(Product product) {
        return productStock.getOrDefault(product, 0);
    }
    
    //method to know if a product is available, return true if the product is available
    public boolean isProductAvailable(Product product, int quantity) {
        return getStock(product) >= quantity;
    }
    
    //method to update the stock a product
    public void updateStock(Product product, int quantity) {
        if (productStock.containsKey(product)) {
            int currentStock = productStock.get(product);
            productStock.put(product, currentStock - quantity);
        }
    }
}

