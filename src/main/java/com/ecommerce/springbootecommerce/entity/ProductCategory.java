package com.ecommerce.springbootecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="product_category")
// @Data --known bug
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(name = "category_name")
    public String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    public Set<Product> products;

}
