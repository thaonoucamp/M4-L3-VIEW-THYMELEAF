package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IGeneralService<Product> {
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "iphone", 1000, "11 pro-max", "apple"));
        products.put(2, new Product(2, "iphone", 2000, "12 pro-max", "apple"));
        products.put(3, new Product(3, "iphone", 3000, "10 pro-max", "apple"));
        products.put(4, new Product(4, "iphone", 4000, "9 pro-max", "apple"));
        products.put(5, new Product(5, "iphone", 5000, "8 pro-max", "apple"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
