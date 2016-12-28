package com.shop.service.api;

import com.shop.repository.api.dto.ProductDto;
import com.shop.repository.api.dto.response.ProductResponse;
import com.shop.repository.api.dto.search.ProductSearchCriteria;

/**
 * Created by Владимир on 27.12.2016.
 * Сервис для работы с товаром
 */
public interface ProductFacadeService {

    /**
     * метод добавляет товар в бд
     * @param product
     * @return
     */
    ProductResponse create(ProductDto product);

    /**
     * метод обновляет товар
     * @param product
     * @return
     */
    ProductResponse update(ProductDto product);

    /**
     * метод удаляет товар из бд
     * @param product
     * @return
     */
    ProductResponse remove(ProductDto product);

    /**
     * метод достает товар из бд по ИД
     * @param id
     * @return
     */
    ProductResponse get(Integer id);

    /**
     * метод выполняет поиск по БД с учетом критерии.
     * Здесь может быть провис, по этому была сделана пагинация, что бы данные
     * возвращались небольшими порциями.
     * Или подключить кэш второго уровня
     * @param criteria
     * @return
     */
    ProductResponse search(ProductSearchCriteria criteria);
}
