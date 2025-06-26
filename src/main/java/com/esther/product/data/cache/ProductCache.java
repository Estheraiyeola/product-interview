package com.esther.product.data.cache;

import java.util.HashMap;

import com.esther.product.data.model.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ProductCache {
    public HashMap<String, Product> eachProduct = new HashMap<>();
    //{
    //  "all": [product1, product2],
    //  "1": product1,
    //  "2": product2

    //}
}
