package com.shop.repository.api.dto;

import org.dozer.Mapping;

/**
 * Created by evseevvd on 28.12.16.
 *
 * Дто "Клиент"
 */
public class ClientDto extends CommonDto {
    /**
     * Ф.И.О. клиента
     */
    @Mapping("name")
    private String name;

    /**
     * Адрес
     */
    @Mapping("adress")
    private String adress;

    /**
     * Телефон
     */
    @Mapping("phone")
    private String phone;

    /**
     * Эл. адрес
     */
    @Mapping("email")
    private String email;
}
