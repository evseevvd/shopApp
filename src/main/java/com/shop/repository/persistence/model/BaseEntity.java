package com.shop.repository.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Владимир on 27.12.2016.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable{

    @Column(name = "ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
