package org.example;

import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println(myConnection);
        MyConnection myConnection2 = context.getBean(MyConnection.class);
        System.out.println(myConnection2);

        context.registerShutdownHook();
    }
}