package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBean.setBeanName: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean.afterPropertiesSet");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean.setBeanFactory: " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean.setApplicationContext: " + applicationContext);
    }
}
