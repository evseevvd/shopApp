package com.shop.configure;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evseevvd on 28.12.16.
 *
 * Конфигурация мапера
 */
public class DozerConfigure {

    @Bean
    public DozerBeanMapper dozerBeanMapper(){
        List<String> mappingFiles = new ArrayList<>();
        mappingFiles.add("dozer.xml");
        DozerBeanMapper beanMapper = new DozerBeanMapper(mappingFiles);
        return beanMapper;
    }
}
