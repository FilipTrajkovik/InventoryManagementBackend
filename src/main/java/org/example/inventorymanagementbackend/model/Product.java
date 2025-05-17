package org.example.inventorymanagementbackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.inventorymanagementbackend.model.enums.Category;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "name", nullable = false)
    public String name;

    @Column(name = "description")
    public String description;

    @Column(name = "price", nullable = false)
    @Min(0)
    public Double price;

    @Column(name = "quantity_in_stock", nullable = false)
    @Min(0)
    public Integer quantityInStock;

    @Column(name = "category", nullable = false)
    @Enumerated(EnumType.STRING)
    public Category category;
}
