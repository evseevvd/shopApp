package com.shop.repository.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Владимир on 27.12.2016.
 *
 * Сущность "Кллиент"
 */
@Entity
@Table(name = "CLIENTS")
public class Client extends BaseEntity {
    /**
     * Ф.И.О. клиента
     */
    @Column(name = "NAME", nullable = false)
    private String name;

    /**
     * Адрес
     */
    @Column(name = "ADRESS", nullable = false)
    private String adress;

    /**
     * Телефон
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * Эл. адрес
     */
    @Column(name = "EMAIL")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
