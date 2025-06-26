package com.esther.product.dto.response;

import com.esther.product.data.model.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatedProductResponse {
    private Product product;
    private String message;
}
