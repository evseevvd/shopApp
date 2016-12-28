package com.shop.repository.api.dto.response;

import com.shop.repository.api.dto.ProductDto;

import java.util.List;

/**
 * Created by Владимир on 27.12.2016.
 *
 * Ответ сервиса для товаров
 */
public class ProductResponse extends CommonResponse{

    private List<ProductDto> products;

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}
