package com.example.javashop.shop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<Product, Integer> cartItems;

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    public void addProduct(Product item, int quantity) {
        cartItems.put(item, cartItems.getOrDefault(item, 0) + quantity);
    }

    public void removeProduct(Product item, int quantity) {
        cartItems.computeIfPresent(item, (key, value) -> value - quantity <= 0 ? null : value - quantity);
    }

    public Map<Product, Integer> getCartItems() {
        return new HashMap<>(cartItems);
    }

    public double calculateTotal() {
        return cartItems.entrySet()
                .stream()
                .mapToDouble(entry -> entry.getKey().getPrice() * entry.getValue())
                .sum();
    }
}

