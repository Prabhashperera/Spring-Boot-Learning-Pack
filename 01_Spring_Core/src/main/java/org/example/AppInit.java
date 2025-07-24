package org.example;

import org.example.bean.SpringBean;
import org.example.bean.TestBean;
import org.example.bean.TestBean2;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppInit {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();


        TestBean bean2 = context.getBean(TestBean.class);
        System.out.println(bean2);

        TestBean bean3 = context.getBean(TestBean.class);
        System.out.println(bean3);


    }
}