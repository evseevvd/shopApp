package com.shop.repository.api.dto.response;

import java.io.Serializable;

/**
 * Created by Владимир on 27.12.2016.
 *
 * Абстракый ответ сервиса
 */
public abstract class CommonResponse implements Serializable{

    private Integer itemPerPage;

    private Integer totalResult;

    private Integer position;

    public Integer getItemPerPage() {
        return itemPerPage;
    }

    public void setItemPerPage(Integer itemPerPage) {
        this.itemPerPage = itemPerPage;
    }

    public Integer getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(Integer totalResult) {
        this.totalResult = totalResult;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
