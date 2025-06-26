package com.esther.product.services;

import java.util.List;

import com.esther.product.data.model.Product;
import com.esther.product.dto.request.CreateProductRequest;
import com.esther.product.dto.response.CreatedProductResponse;

public interface ProductService{

    // Create a product
    public CreatedProductResponse createProduct(CreateProductRequest createProductRequest);
    //Get all product
    public Object getAllProducts();

}