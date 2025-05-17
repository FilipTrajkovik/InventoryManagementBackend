package org.example.inventorymanagementbackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDTO {
    public Long id;

    public String name;

    public String description;

    public Double price;

    public Integer quantityInStock;

    public String category;
}
