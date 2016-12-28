package com.shop.repository.api.dto;

import org.dozer.Mapping;

import java.math.BigDecimal;

/**
 * Created by evseevvd on 28.12.16.
 *
 * ДТО "Товар"
 */
public class ProductDto extends CommonDto{
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

    /**
     * Поставщик
     */
    @Mapping("provider")
    private ProviderDto provider;

    /**
     * Категория товара
     */
    @Mapping("category")
    private CategoryDto category;

    /**
     * Производитель
     */
    @Mapping("producer")
    private ProducerDto producer;

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

    public ProviderDto getProvider() {
        return provider;
    }

    public void setProvider(ProviderDto provider) {
        this.provider = provider;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public ProducerDto getProducer() {
        return producer;
    }

    public void setProducer(ProducerDto producer) {
        this.producer = producer;
    }
}

