package org.example.inventorymanagementbackend.service.impl;

import org.example.inventorymanagementbackend.dto.CreateProductDTO;
import org.example.inventorymanagementbackend.dto.ProductDTO;
import org.example.inventorymanagementbackend.exception.ProductNotFoundException;
import org.example.inventorymanagementbackend.model.Product;
import org.example.inventorymanagementbackend.model.enums.Category;
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

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product with id " + id + " was not found."));
    }

    @Override
    public Product addProduct(CreateProductDTO createProductDTO) {
        Product product = new Product();
        
        product.setName(createProductDTO.getName());
        product.setDescription(createProductDTO.getDescription());
        product.setPrice(createProductDTO.getPrice());
        product.setQuantityInStock(createProductDTO.getQuantityInStock());
        product.setCategory(Category.valueOf(createProductDTO.getCategory()));

        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, CreateProductDTO createProductDTO) {
        Product product = getProductById(id);

        product.setName(createProductDTO.getName());
        product.setDescription(createProductDTO.getDescription());
        product.setPrice(createProductDTO.getPrice());
        product.setQuantityInStock(createProductDTO.getQuantityInStock());
        product.setCategory(Category.valueOf(createProductDTO.getCategory()));

        return productRepository.save(product);
    }


}
