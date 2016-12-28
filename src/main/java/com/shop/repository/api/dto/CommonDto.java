package com.shop.repository.api.dto;

import org.dozer.Mapping;

import java.io.Serializable;

/**
 * Created by evseevvd on 28.12.16.
 *
 * Общая ДТО
 */
public abstract class CommonDto implements Serializable {

    @Mapping("id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
