package com.esther.product.data.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.esther.product.data.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}