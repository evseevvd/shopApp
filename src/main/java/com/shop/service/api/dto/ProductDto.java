package com.shop.service.api.dto;

import org.dozer.Mapping;

import java.math.BigDecimal;

/**
 * Created by evseevvd on 28.12.16.
 *
 * ДТО "Товар"
 */
public class ProductDto {
    /**
     * Наименование товара
     */
    @Mapping("name")
    private String name;

    /**
     * Номенклатурный код товара
     */
    @Mapping("code")
    private String code;

    /**
     * Кол-во товара на складе
     */
    @Mapping("quatity")
    private Integer quatity;

    /**
     * Цена за 1 ед.
     */
    @Mapping("price")
    private BigDecimal price;

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

    public Integer getQuatity() {
        return quatity;
    }

    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * Поставщик
     */
//    private Provider provider;

    /**
     * Категория товара
     */
//    private Category category;

    /**
     * Производитель
     */
//    private Producer producer;

    /**
     * Ссылка на заказы
     */
//    private List<Order> orders;
}
