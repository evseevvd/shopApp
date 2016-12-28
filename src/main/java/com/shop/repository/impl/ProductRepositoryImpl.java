package com.shop.repository.impl;

import com.shop.repository.api.ProductRepository;
import com.shop.repository.api.dto.response.ProductResponse;
import com.shop.repository.common.RepositoryImpl;
import com.shop.repository.persistence.model.Product;
import com.shop.repository.api.dto.search.ProductSearchCriteria;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Владимир on 27.12.2016.
 *
 * Репозиторий для Товара
 */
@Repository("productRepository")
public class ProductRepositoryImpl extends RepositoryImpl<Product> implements ProductRepository {

    public ProductRepositoryImpl() {
        super(Product.class);
    }

    @Override
    public ProductResponse search(ProductSearchCriteria criteria) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Product> query = criteriaBuilder.createQuery(Product.class);
        Root<Product> root = query.from(Product.class);

        List<Predicate> predicates = new ArrayList<>();

        if (!criteria.getCode().isEmpty()) {
            predicates.add(criteriaBuilder.like(root.get("code"), criteria.getCode()));
        }

        if (!criteria.getName().isEmpty()) {
            predicates.add(criteriaBuilder.like(root.get("name"), criteria.getName()));
        }

        if (criteria.getStarPrice() != null && criteria.getEndPrice() != null) {
            predicates.add(criteriaBuilder.between(root.get("price"), criteria.getStarPrice(), criteria.getEndPrice()));
        }

        query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));

        int totalRecords = em.createQuery(query).getResultList().size();

        Query result = em.createQuery(query);
        result.setMaxResults(criteria.getItemPerPage());
        result.setFirstResult(criteria.getPosition());

        ProductResponse response = new ProductResponse();
        response.setProducts(result.getResultList());
        response.setItemPerPage(criteria.getItemPerPage());
        response.setPosition(criteria.getPosition());
        response.setTotalResult(totalRecords);
        return response;
    }
}
