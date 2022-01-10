package com.mashibing.r_populateBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPopulate {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("/r_populateBean/populateBean.xml");
//        ac.close();
    }
}
