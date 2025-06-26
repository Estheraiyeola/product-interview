package com.esther.product.utils;

import com.esther.product.data.model.Product;
import com.esther.product.dto.request.CreateProductRequest;
import com.esther.product.dto.response.CreatedProductResponse;

public class Mapper {

    public static Product mapProductRequestToObject(CreateProductRequest createProductRequest){
        Product newProduct = new Product();
        newProduct.setProductName(createProductRequest.getProductName());
        newProduct.setProductDescription(createProductRequest.getProductDescription());
        newProduct.setProductPrice(createProductRequest.getProductPrice());
        return newProduct;
    }

    public static CreatedProductResponse mapSavedProductToResponse(Product savedProduct) {
        CreatedProductResponse response = new CreatedProductResponse();
        response.setProduct(savedProduct);
        response.setMessage("Product Created");
        return response;
    }
    
}
