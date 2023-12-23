/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

    public Inventory() {
        productStock = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        for (Product product : Product.values()) {
            productStock.put(product, 5); // Initialize each product with 5 quantity
        }
    }

    public int getStock(Product product) {
        return productStock.getOrDefault(product, 0);
    }

    public boolean isProductAvailable(Product product, int quantity) {
        return getStock(product) >= quantity;
    }

    public void updateStock(Product product, int quantity) {
        if (productStock.containsKey(product)) {
            int currentStock = productStock.get(product);
            productStock.put(product, currentStock - quantity);
        }
    }
}

