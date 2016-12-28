package com.shop.web.rest;

import com.shop.repository.api.dto.response.ProductResponse;
import com.shop.repository.api.dto.search.ProductSearchCriteria;
import com.shop.service.api.ProductFacadeService;
import com.shop.repository.api.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by Владимир on 25.12.2016.
 */
@RestController
@RequestMapping(UrlConstants.BASE_URL+"/products")
public class ProductRest {

    @Autowired
    @Qualifier("productFacadeService")
    private ProductFacadeService productFacadeService;

    @GetMapping("/ping")
    public String ping() {
        return "Ping success";
    }

    @PostMapping("/create")
    public ProductResponse create(ProductDto productDto) {
        return productFacadeService.create(productDto);
    }

    @PostMapping("/create")
    public ProductResponse create(ProductSearchCriteria criteria) {
        return productFacadeService.search(criteria);
    }
}
