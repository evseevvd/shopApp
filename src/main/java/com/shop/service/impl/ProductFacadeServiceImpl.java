package com.shop.service.impl;

import com.shop.repository.api.ProductRepository;
import com.shop.repository.api.dto.response.ProductResponse;
import com.shop.repository.persistence.model.Product;
import com.shop.repository.api.dto.search.ProductSearchCriteria;
import com.shop.service.api.ProductFacadeService;
import com.shop.repository.api.dto.ProductDto;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by Владимир on 27.12.2016.
 */
@Service("productFacadeService")
public class ProductFacadeServiceImpl implements ProductFacadeService {

    @Autowired
    @Qualifier("productRepository")
    private ProductRepository productRepository;

    @Autowired
    private Mapper mapper;

    @Override
    public ProductResponse create(ProductDto product) {
        Product saveEntity = mapper.map(product, Product.class);
        ProductDto resultEntity = mapper.map(productRepository.create(saveEntity), ProductDto.class);
        ProductResponse response = new ProductResponse();
        response.setProducts(Arrays.asList(resultEntity));
        return response;
    }

    @Override
    public ProductResponse update(ProductDto product) {
        Product updateEntity = mapper.map(product, Product.class);
        ProductDto resultEntity = mapper.map(productRepository.update(updateEntity), ProductDto.class);
        ProductResponse response = new ProductResponse();
        response.setProducts(Arrays.asList(resultEntity));
        return response;
    }

    @Override
    public ProductResponse remove(ProductDto product) {
        Product removeEntity = mapper.map(product, Product.class);
        productRepository.remove(removeEntity);
        return new ProductResponse();
    }

    @Override
    public ProductResponse get(Integer id) {
        ProductResponse response = new ProductResponse();
        ProductDto resultEntity = mapper.map(productRepository.read(id), ProductDto.class);
        response.setProducts(Arrays.asList(resultEntity));
        return response;
    }

    @Override
    public ProductResponse search(ProductSearchCriteria criteria) {
        ProductResponse results = productRepository.search(criteria);
        return null;
    }
}
