package com.shop.service.api;

import com.shop.repository.api.response.ProductResponse;

/**
 * Created by Владимир on 27.12.2016.
 */
public interface ProductFacadeService {

    ProductResponse create(ProductDto product);

    ProductResponse update(ProductDto product);

    ProductResponse remove(ProductDto product);

    ProductResponse getProduct(Integer id);
}
