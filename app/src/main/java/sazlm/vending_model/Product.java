/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sazlm.vending_model;

/*
 * The Product enum represents different products available in the vending machine system.
 * Each product is associated with a specific price and provides methods to retrieve the price and get a product by name.
 */
/**
 *
 * @author ialex
 */
/**
 * Represents various products available in the vending machine system.
 */
public enum Product {
    PERMEN(10_000),
    MASKER(20_000),
    OBAT(20_000),
    LILIN(25_000),
    ROKOK(30_000),
    ZIPPO_FLUID(40_000),
    TRAVEL_CABLE(85_000),
    FLASHDISK(115_000),
    POWERBANK(180_000),
    ZIPPO_LIGHTER(70_000),
    NONE(0);
    
    private int price;// Represents the price of each product

    /**
     * Constructor for the Product enum to assign prices to each product.
     *
     * @param price The price associated with the product.
     */
    public int getPrice() {
        return price;
    }

    Product(int price){
        this.price = price;
    }
    
    /**
     * Retrieves a product by its name (case-insensitive).
     * 
     * @param productName The name of the product to retrieve.
     * @return The corresponding Product enum value based on the provided name, or NONE if no match is found.
     */
    public static Product getProduct(String productName) {
    for (Product product : Product.values()) {
        if (product.name().equalsIgnoreCase(productName)) {
            return product;
        }
    }
    return Product.NONE; // Return a default value if no match is found
    }
}
