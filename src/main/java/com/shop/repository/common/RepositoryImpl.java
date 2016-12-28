package com.shop.repository.common;

import com.shop.repository.persistence.model.BaseEntity;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by Владимир on 27.12.2016.
 */
@NoRepositoryBean
public abstract class RepositoryImpl<E extends BaseEntity> implements Repository<E> {

    private final Class<E> entityClass;

    @PersistenceContext
    protected EntityManager em;

    protected RepositoryImpl(Class<? extends BaseEntity> entityClass) {
        this.entityClass = (Class<E>) entityClass;
    }


    @Override
    @Transactional
    public E create(E entity) {
        em.persist(entity);
        return entity;
    }

    @Override
    @Transactional
    public E update(E entity) {
        em.merge(entity);
        return entity;
    }

    @Override
    @Transactional
    public E read(Serializable id) {
        return em.find(entityClass, id);
    }

    @Override
    @Transactional
    public void remove(E entity) {
        em.remove(entity);
    }
}
