package com.shop.repository.persistence.model;

import com.shop.repository.utils.Status;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Владимир on 27.12.2016.
 *
 * Сущность "Заказ"
 */
@Entity
@Table(name = "ORDERS")
public class Order extends BaseEntity {

    /**
     * Кол-во товара
     */
    @Column(name = "QUANTITY", nullable = false)
    private Integer quatity;

    /**
     * Цена за кол-во товара
     */
    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    /**
     * Статус заказа
     */
    @Column(name = "STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    /**
     * Кто заказал (Клиент)
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @ManyToMany
    @JoinTable(name = "ORDERS_PRODUCTS", schema = "SHOP", joinColumns = {
            @JoinColumn(name = "ORDER_ID", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "PRODUCT_ID",
                    nullable = false, updatable = false) })
    private Set<Product> products = new HashSet<>();

    public Integer getQuatity() {
        return quatity;
    }

    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
