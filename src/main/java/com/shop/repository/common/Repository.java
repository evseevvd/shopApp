package com.shop.repository.common;

import com.shop.repository.persistence.model.BaseEntity;

import java.io.Serializable;

/**
 * Created by Владимир on 27.12.2016.
 */

public interface Repository<E extends BaseEntity>{

    E create(E entity);

    E update(E entity);

    E read(Serializable id);

    void remove(E entity);
}
