package com.shop.repository.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Владимир on 27.12.2016.
 *
 * Сущность "Категория"
 */
@Entity
@Table(name = "CATEGORIES")
public class Category extends BaseEntity{
    /**
     * Наименование категории
     */
    @Column(name = "NAME", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
