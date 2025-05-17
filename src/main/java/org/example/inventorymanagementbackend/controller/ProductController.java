package org.example.inventorymanagementbackend.controller;


import org.example.inventorymanagementbackend.dto.ProductDTO;
import org.example.inventorymanagementbackend.service.ProductMapperService;
import org.example.inventorymanagementbackend.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final ProductMapperService productMapperService;

    public ProductController(ProductService productService, ProductMapperService productMapperService) {
        this.productService = productService;
        this.productMapperService = productMapperService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> products = productService.getAllProducts()
                .stream()
                .map(productMapperService::getAsProductDto)
                .collect(Collectors.toList());

        return new ResponseEntity<>(products, HttpStatus.OK);
    };
}
