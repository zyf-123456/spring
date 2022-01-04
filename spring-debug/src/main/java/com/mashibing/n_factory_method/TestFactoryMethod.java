package com.mashibing.n_factory_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryMethod {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/n_fatory_method/factoryMethod.xml");
        Person person = ac.getBean("person", Person.class);
        System.out.println(person);
        Person person2 = ac.getBean("person2", Person.class);
        System.out.println(person2);
    }
}
