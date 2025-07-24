package org.example;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Agreement {

    Girl() {
        System.out.println("Girl constructor called");
    }

    @Override
    public void chat() {
        System.out.println("Girl 1 chat called");
    }
}
