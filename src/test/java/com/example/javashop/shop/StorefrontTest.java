package com.example.javashop.shop;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StorefrontTest {
    @Test
    void test(){
        Set<Product> itemList = new HashSet<>();
        Product product1 = new Product("Product 1", 19.99);
        Product product2 = new Product("Product 2", 29.99);
        itemList.add(product1);
        itemList.add(product1);
        itemList.add(product2);
        itemList.add(product2);

        assertEquals(2, itemList.size());
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(product1, 2);
        shoppingCart.addProduct(product2, 1);
        shoppingCart.removeProduct(product2, 1);

        assertEquals(shoppingCart.calculateTotal(),39.98 );

    }

}