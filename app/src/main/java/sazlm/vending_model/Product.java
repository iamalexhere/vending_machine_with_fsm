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
    PERMEN(10),
    MASKER(20),
    OBAT(20),
    LILIN(25),
    ROKOK(30),
    ZIPPO_FLUID(40),
    TRAVEL_CABEL(85),
    FLASHDISK(115),
    POWERBANK(180),
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
