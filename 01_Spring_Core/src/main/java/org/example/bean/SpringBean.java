package org.example.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean");
    }
}
