package com.esther.product.utils;

import com.esther.product.data.model.Product;
import com.esther.product.dto.request.CreateProductRequest;

public class Mapper {

    public static Product mapProductRequestToObject(CreateProductRequest createProductRequest){
        Product newProduct = new Product();
        newProduct.setProductName(createProductRequest.getProductName());
        newProduct.setProductDescription(createProductRequest.getProductDescription());
        newProduct.setProductPrice(createProductRequest.getProductPrice());
        return newProduct;
    }
    
}
