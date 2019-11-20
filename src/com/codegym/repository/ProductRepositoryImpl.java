package com.codegym.repository;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {

    ArrayList<Product> listProducts = new ArrayList<>();


    {
        listProducts.add(new Product(1, "Samsung Galaxy S10", 20));
        listProducts.add(new Product(2, "Iphone X", 30));
        listProducts.add(new Product(3, "OPPO", 10));
        listProducts.add(new Product(4, "NOKIA", 9));
        listProducts.add(new Product(5, "VSMART PRO", 6));
    }

    @Override
    public List<Product> findAll() {
        return listProducts;
    }

    @Override
    public void add(Product product) {
        listProducts.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                int index = i;
                listProducts.set(index, product);
            }
        }

    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                listProducts.remove(i);
                return;
            }
        }
    }

    @Override
    public void findByName(String name) {
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getName().contains(name)) {
                products.add(listProducts.get(i));
                for (Product p : products) {
                    System.out.println("ID: " + p.getId() + " Name: " + p.getName() + " Price: " + p.getPrice() + " Trieu");
                }
            }
        }
    }


    public int compare(Product p1, Product p2) {
        if (p1.getPrice() > p2.getPrice()) {
            return 1;
        } else if (p1.getPrice() < p2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public void sortPrice() {
        Collections.sort(listProducts, this::compare);
        for (Product p : listProducts) {
            System.out.println("ID: " + p.getId() + "\tNAME: " + p.getName() + "\tPRICE: " + p.getPrice());
        }

    }


    @Override
    public Boolean check(Object o) {
        Boolean check = false;
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() <= listProducts.size()) {
                check = true;
                break;
            }
        }
        return check;

    }


}

