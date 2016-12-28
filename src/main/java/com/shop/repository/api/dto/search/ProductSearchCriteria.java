package com.shop.repository.api.dto.search;

import java.math.BigDecimal;

/**
 * Created by Владимир on 27.12.2016.
 *
 * <p>критерий поиска для товаров</p>
 */
public class ProductSearchCriteria extends SearchCriteriaWhithPagination{

    private int id;

    private String name;

    private BigDecimal starPrice;
    private BigDecimal endPrice;

    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getStarPrice() {
        return starPrice;
    }

    public void setStarPrice(BigDecimal starPrice) {
        this.starPrice = starPrice;
    }

    public BigDecimal getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(BigDecimal endPrice) {
        this.endPrice = endPrice;
    }
}
