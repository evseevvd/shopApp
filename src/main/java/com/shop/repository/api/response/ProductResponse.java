package com.shop.repository.api.response;

import com.shop.repository.persistence.model.Product;

import java.util.List;

/**
 * Created by Владимир on 27.12.2016.
 *
 * Ответ сервиса для товаров
 */
public class ProductResponse extends CommonResponse{

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
