package com.shop.repository.persistence.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Владимир on 27.12.2016.
 *
 * Сущность "Товар"
 */
@Entity
@Table(name = "PRODUCTS")
public class Product extends BaseEntity{

    /**
     * Наименование товара
     */
    @Column(name = "NAME", nullable = false)
    private String name;

    /**
     * Номенклатурный код товара
     */
    @Column(name = "CODE", nullable = false)
    private String code;

    /**
     * Кол-во товара на складе
     */
    @Column(name = "QUANTITY", nullable = false)
    private Integer quatity;

    /**
     * Цена за 1 ед.
     */
    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    /**
     * Поставщик
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROVIDER_ID")
    private Provider provider;

    /**
     * Категория товара
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    /**
     * Производитель
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCER_ID")
    private Producer producer;

    /**
     * Ссылка на заказы
     */
    @ManyToMany
    @JoinTable(name = "ORDERS_PRODUCTS", schema = "SHOP", joinColumns = {
            @JoinColumn(name = "ORDER_ID", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "PRODUCT_ID",
                    nullable = false, updatable = false) })
    private List<Order> orders;

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

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
