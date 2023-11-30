package com.example.javashop.shop;
import java.util.*;

public class Product {
    private final UUID key;
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.key = UUID.randomUUID();;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product item = (Product) obj;
        return key == item.key && name.equals(item.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result;
        return result;
    }
}
