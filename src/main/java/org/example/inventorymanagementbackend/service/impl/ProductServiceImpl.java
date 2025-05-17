package org.example.inventorymanagementbackend.service.impl;

import org.example.inventorymanagementbackend.model.Product;
import org.example.inventorymanagementbackend.repository.ProductRepository;
import org.example.inventorymanagementbackend.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
