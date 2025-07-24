package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SpringBean {
    public SpringBean() {
        Map<String, String> getenv = System.getenv();
        System.out.println(getenv);
    }
}
