package com.mashibing.q_init_destory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/q_init_destory/test.xml");
        //init
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
        //关闭后调用 Destory
        context.close();
    }
}
