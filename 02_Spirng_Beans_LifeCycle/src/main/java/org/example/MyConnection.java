package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.sql.Connection;

public class MyConnection implements DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public MyConnection() {
        System.out.println("MyConnection Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection destroyed");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name : " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory : " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext : " + applicationContext);
    }
}
