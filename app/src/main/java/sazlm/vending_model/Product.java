/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sazlm.vending_model;

/**
 *
 * @author ialex
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
    
    private int price;

    public int getPrice() {
        return price;
    }

    Product(int price){
        this.price = price;
    }

    public static Product getProduct(String productName) {
    for (Product product : Product.values()) {
        if (product.name().equalsIgnoreCase(productName)) {
            return product;
        }
    }
    return Product.NONE; // Return a default value if no match is found
    }
}
