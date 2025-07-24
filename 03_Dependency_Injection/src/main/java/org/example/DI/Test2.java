package org.example.DI;

import org.springframework.stereotype.Component;

@Component
public class Test2 implements DI {
    Test2() {
        System.out.println("Test2 constructor called");
    }
    @Override
    public void sayHello() {

    }
}
