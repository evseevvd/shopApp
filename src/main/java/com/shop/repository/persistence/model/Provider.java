package com.shop.repository.persistence.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Владимир on 27.12.2016.
 *
 * Сущность поставщик
 */
@Entity
@Table(name = "PROVIDERS")
public class Provider extends BaseEntity{
    /**
     * Наименование поставщика
     */
    @Column(name = "NAME")
    private String name;

    /**
     * Адрес
     */
    @Column(name = "ADRESS")
    private String adress;

    /**
     * Контакт (телефон, эл. почта и т.д.)
     */
    @Column(name = "CONTACT")
    private String contact;

    /**
     * Ссылка на товары
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "provider", cascade = CascadeType.ALL)
    private List<Product> products;

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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
