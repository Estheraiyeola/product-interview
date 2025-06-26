package com.esther.product.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esther.product.data.cache.ProductCache;
import com.esther.product.data.model.Product;
import com.esther.product.data.repository.ProductRepository;
import com.esther.product.dto.request.CreateProductRequest;
import com.esther.product.dto.response.CreatedProductResponse;
import com.esther.product.utils.Mapper;

import lombok.AllArgsConstructor;

import static com.esther.product.utils.Mapper.mapSavedProductToResponse;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductCache productCache;


    // Create a product
    @Override
    public CreatedProductResponse createProduct(CreateProductRequest createProductRequest){

        Product newProduct = Mapper.mapProductRequestToObject(createProductRequest);
        Product savedProduct = productRepository.save(newProduct);
        productCache.eachProduct.put(newProduct.getId().toString(), newProduct);
        return mapSavedProductToResponse(savedProduct);
    }



    //Get all product
    @Override
    public Object getAllProducts(){
        //Check the cache to see if it is empty
        if(productCache.eachProduct.isEmpty()){
            // if it exists, return it
            return productCache.eachProduct.values();
        }

         // else fetch from the database
        return productRepository.findAll();
    }
    // public Product getAProduct(){

    // }
}
