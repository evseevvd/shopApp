package com.shop.repository.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Владимир on 27.12.2016.
 *
 * Сущность "Производитель"
 */
@Entity
@Table(name = "PRODUCERS")
public class Producer extends BaseEntity {

    /**
     * Наименование производителя
     */
    @Column(name = "NAME", nullable = false)
    private String name;

    /**
     * Страна производства
     */
    @Column(name = "COUNTRY", nullable = false)
    private String country;
}
