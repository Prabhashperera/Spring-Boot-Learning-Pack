package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {
    }
}
