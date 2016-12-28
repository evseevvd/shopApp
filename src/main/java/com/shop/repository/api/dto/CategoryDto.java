package com.shop.repository.api.dto;

import org.dozer.Mapping;

/**
 * Created by evseevvd on 28.12.16.
 *
 * Дто "Категория"
 */
public class CategoryDto extends CommonDto {

    /**
     * Наименование категории
     */
    @Mapping("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
