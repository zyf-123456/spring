package com.mashibing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSc {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
        System.out.println(context.getBean("person"));
    }
}
