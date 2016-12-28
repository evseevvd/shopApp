package com.shop.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Владимир on 24.12.2016.
 *
 * Класс конфигурации приложения
 */
@Configuration
@EnableWebMvc
@ComponentScan({
        "com.shop.repository",
        "com.shop.service",
        "com.shop.web",
})
@Import({
        PersistenceConfig.class,
        DozerConfigure.class
})
public class AppConfiguration extends WebMvcConfigurerAdapter{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}
