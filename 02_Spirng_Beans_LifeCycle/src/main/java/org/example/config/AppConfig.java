package org.example.config;

import org.example.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
public class AppConfig {
    @Bean
    public MyConnection getMyConnection() {
        return new MyConnection();
    }
}
