package com.example.javashop.shop;

import java.util.HashSet;
import java.util.Set;

public class Storefront {
    public static Set<Product> itemList = new HashSet<>();

    public static void main(String[] args) {

        Product product1 = new Product("Product 1", 19.99);
        Product product2 = new Product("Product 2", 29.99);
        itemList.add(product1);
        itemList.add(product2);
        itemList.add(product2); //duplicate
        //override equals and hashcode

        System.out.println("Items in the list should only be 2:");
        for (Product product : itemList) {
            System.out.println(product.getName());
        }
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(product1, 2);
        shoppingCart.addProduct(product2, 1);
        shoppingCart.removeProduct(product2, 1);

        System.out.println("Current Cart Items:");
        shoppingCart.getCartItems().forEach((item, quantity) ->
                System.out.println(item.getName() + " - Quantity: " + quantity));
        System.out.println("Total Price: $" + shoppingCart.calculateTotal());
    }
}
