package com.shop.repository.search;

import java.io.Serializable;

/**
 * Created by Владимир on 27.12.2016.
 *
 * Абстрактный класс для критерии поиска с пагинацией
 */
public abstract class SearchCriteriaWhithPagination implements Serializable {

    /**
     * Элементов на странице
     */
    private Integer itemPerPage = 10;

    /**
     * Сколько всего записей в выборке
     */
    private Long totalItems;

    /**
     * Номер страницы
     */
    private Integer page;

    /**
     * позиция в списке результатов
     */
    private Integer position;

    public int getItemPerPage() {
        return itemPerPage;
    }

    public void setItemPerPage(int itemPerPage) {
        this.itemPerPage = itemPerPage;
    }

    public Long getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
