package com.mashibing.j_createbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 拓展AbstractRefreshableApplicationContext.customizeBeanFactory方法。
 * 自定义beanfactory的信息
 * AllowBeanDefinitionOverriding:允许bean的定义信息可以覆盖
 * AllowCircularReferences:允许
 */
public class BeanApplicationContext extends  ClassPathXmlApplicationContext{

    public BeanApplicationContext(String... configLocations){
        super(configLocations);
    }
    public static void main(String[] args) {
        //测试加载
        ApplicationContext context = new BeanApplicationContext("/j_createbean/spring.xml");
    }
}
