package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();


    @Override
    public void sortPrice() {
        productRepository.sortPrice();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }


    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        productRepository.edit(id, product);
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
    }

    @Override
    public void findByName(String name) {
        productRepository.findByName(name);
    }

    @Override
    public Boolean check(Object o) {
        return productRepository.check(o);
    }
}


