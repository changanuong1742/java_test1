package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.IGeneralRepository;

public interface IProductService extends IGeneralService<Product> {
    void sortPrice();
}
