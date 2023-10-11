package com.anup.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class HelloBean {
    private static final Logger logger = Logger.getLogger("");

    HelloBean(@Value("${helloMessage}") String helloMessage) {
        logger.info(helloMessage);
    }
}
