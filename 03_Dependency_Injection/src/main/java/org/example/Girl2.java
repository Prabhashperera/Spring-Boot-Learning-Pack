package org.example;

import org.springframework.stereotype.Component;

@Component
public class Girl2 implements Agreement {
    @Override
    public void chat() {
        System.out.println("Girl2 chat called");
    }
}
