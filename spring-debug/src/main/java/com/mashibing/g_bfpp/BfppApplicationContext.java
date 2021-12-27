package com.mashibing.g_bfpp;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 拓展AbstractRefreshableApplicationContext.customizeBeanFactory方法。
 * 自定义beanfactory的信息
 * AllowBeanDefinitionOverriding:允许bean的定义信息可以覆盖
 * AllowCircularReferences:允许
 */
public class BfppApplicationContext extends  ClassPathXmlApplicationContext{

    public BfppApplicationContext(String... configLocations){
        super(configLocations);
    }

    //通过类的方式添加bfpp
    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        System.out.println("拓展实现");
        super.addBeanFactoryPostProcessor(new MyBfpp());
    }

    public static void main(String[] args) {
        //测试加载
        ApplicationContext context = new BfppApplicationContext("/g_bfpp/spring.xml");
    }
}
