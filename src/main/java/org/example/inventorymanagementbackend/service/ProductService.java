package org.example.inventorymanagementbackend.service;

import org.example.inventorymanagementbackend.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

}
