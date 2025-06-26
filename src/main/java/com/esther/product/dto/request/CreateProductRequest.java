package com.esther.product.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateProductRequest {
    private String productName;
    private String productDescription;
    private double productPrice;
}
