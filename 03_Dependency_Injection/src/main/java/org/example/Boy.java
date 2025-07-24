package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Autowired
    @Qualifier("girl")
    Agreement girl;
    Boy() {
        System.out.println("Boy constructor called");
    }

    public void chatWithGirl() {
        girl.chat();
    }
}
