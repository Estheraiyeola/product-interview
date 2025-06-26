package com.esther.product.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    private Long id;
    private String productName;
    private String productDescription;
    private double productPrice;
}