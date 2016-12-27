package com.shop.repository.api;

import com.shop.repository.api.response.ProductResponse;
import com.shop.repository.common.Repository;
import com.shop.repository.persistence.model.Product;
import com.shop.repository.search.ProductSearchCriteria;
import com.shop.repository.search.SearchCriteriaWhithPagination;

/**
 * Created by Владимир on 27.12.2016.
 */

public interface ProductRepository extends Repository<Product> {

    /**
     * Метод выполняет поиск среди товаров, для избежания перегрузки сервера сделана пагинация
     * т.е. данные будут возвращатся небольшыми порциями. см {@link SearchCriteriaWhithPagination}
     * @param {@link ProductSearchCriteria}
     * @return {@link ProductResponse}
     */
    ProductResponse search(ProductSearchCriteria criteria);
}
