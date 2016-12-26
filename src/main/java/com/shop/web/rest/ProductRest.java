package com.shop.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Владимир on 25.12.2016.
 */
@RestController
@RequestMapping(UrlConstants.BASE_URL+"/products")
public class ProductRest {

    @GetMapping("/ping")
    public String ping() {
        return "Ping success";
    }
}
