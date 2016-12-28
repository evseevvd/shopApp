package com.shop.repository.api.dto;

import com.shop.repository.persistence.model.Client;
import com.shop.repository.utils.Status;
import org.dozer.Mapping;

import java.math.BigDecimal;

/**
 * Created by evseevvd on 28.12.16.
 *
 * Дто "Заказ"
 */
public class OrderDto extends CommonDto {

    /**
     * Кол-во товара
     */
    @Mapping("quatity")
    private Integer quatity;

    /**
     * Цена за кол-во товара
     */
    @Mapping("amount")
    private BigDecimal amount;

    /**
     * Статус заказа
     */
    @Mapping("status")
    private Status status;

    /**
     * Кто заказал (Клиент)
     */
    @Mapping("client")
    private Client client;

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

//    private Set<Product> products = new HashSet<>();
}
