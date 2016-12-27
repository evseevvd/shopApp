package com.shop.service.impl;

import com.shop.repository.api.ProductRepository;
import com.shop.repository.persistence.model.Product;
import com.shop.service.api.ProductFacadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Владимир on 27.12.2016.
 */
@Service("productFacadeService")
public class ProductFacadeServiceImpl implements ProductFacadeService {

    @Autowired
    @Qualifier("productRepository")
    private ProductRepository productRepository;

    @Override
    public void create() {
        productRepository.create(new Product());
    }
}
