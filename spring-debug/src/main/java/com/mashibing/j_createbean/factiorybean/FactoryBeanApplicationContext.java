package com.mashibing.j_createbean.factiorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 拓展AbstractRefreshableApplicationContext.customizeBeanFactory方法。
 * 自定义beanfactory的信息
 * AllowBeanDefinitionOverriding:允许bean的定义信息可以覆盖
 * AllowCircularReferences:允许
 */
public class FactoryBeanApplicationContext extends  ClassPathXmlApplicationContext{

    public FactoryBeanApplicationContext(String... configLocations){
        super(configLocations);
    }

    public static void main(String[] args) {
        //测试加载、
        ApplicationContext context = new FactoryBeanApplicationContext("/j_createbean/factoryBean.xml");
        MyFactoryBean myFactoryBean = (MyFactoryBean) context.getBean("&myFactoryBean");
        User bean = (User) context.getBean("myFactoryBean");
        System.out.println(myFactoryBean);
        System.out.println(bean);
    }
}
