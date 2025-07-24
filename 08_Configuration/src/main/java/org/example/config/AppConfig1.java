package org.example.config;

import org.example.beans.SpringBeanOne;
import org.example.beans.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {

    @Bean
    public SpringBeanOne springBeanOne() {
        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo springBeanTwo() {
        return new SpringBeanTwo();
    }
}
