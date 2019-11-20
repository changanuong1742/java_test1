
package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductServiceImpl;

import java.util.List;

public class ProductController {

    ProductServiceImpl productService = new ProductServiceImpl();

    public List<Product> getProducts() {
        return productService.findAll();
    }

    public void addProduct(Product product) {
        productService.add(product);

    }

    public void editProduct(int id, Product product) {
        productService.edit(id, product);
    }

    public void deleteProduct(int id) {
        productService.delete(id);

    }

    public void findByName(String name) {
        productService.findByName(name);
    }

    public void sortPrice() {
        productService.sortPrice();
    }

    public Boolean check(Object o) {
        return productService.check(o);
    }
}
