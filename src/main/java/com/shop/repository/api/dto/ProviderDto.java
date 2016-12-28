package com.shop.repository.api.dto;

import com.shop.repository.persistence.model.Product;
import org.dozer.Mapping;

import java.util.List;

/**
 * Created by evseevvd on 28.12.16.
 */
public class ProviderDto extends CommonDto {
    /**
     * Наименование поставщика
     */
    @Mapping("name")
    private String name;

    /**
     * Адрес
     */
    @Mapping("adress")
    private String adress;

    /**
     * Контакт (телефон, эл. почта и т.д.)
     */
    @Mapping("contact")
    private String contact;

    /**
     * Ссылка на товары
     */
    @Mapping("products")
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
