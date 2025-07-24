package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    public SpringBean( @Value("Prabash") String name) {
        System.out.println("SpringBean name: " + name);
    }

    @Autowired
    public SpringBean( @Value("Prabash") String name , @Value("12") int value) {
        System.out.println("SpringBean name: " + name + " value: " + value);
    }
}
