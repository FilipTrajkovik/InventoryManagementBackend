package org.example.inventorymanagementbackend.service;

import org.example.inventorymanagementbackend.dto.CreateProductDTO;
import org.example.inventorymanagementbackend.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product addProduct(CreateProductDTO createProductDTO);

    Product updateProduct(Long id, CreateProductDTO createProductDTO);

    Product deleteProduct(Long id);

}
