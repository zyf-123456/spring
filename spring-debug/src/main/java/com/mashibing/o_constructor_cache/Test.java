package com.mashibing.o_constructor_cache;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/o_constructor_cache/test.xml");
        Person bean = context.getBean(Person.class);
    }
}
