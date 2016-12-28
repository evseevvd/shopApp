package com.shop.repository.api.dto;

import org.dozer.Mapping;

/**
 * Created by evseevvd on 28.12.16.
 *
 * ДТО "Производитель"
 */
public class ProducerDto extends CommonDto {

    /**
     * Наименование производителя
     */
    @Mapping("name")
    private String name;

    /**
     * Страна производства
     */
    @Mapping("country")
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
