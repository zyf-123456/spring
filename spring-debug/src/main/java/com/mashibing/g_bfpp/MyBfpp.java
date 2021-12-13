package com.mashibing.g_bfpp;

import com.mashibing.e_bf_prepared.Customer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 拓展AbstractRefreshableApplicationContext.customizeBeanFactory方法。
 * 自定义beanfactory的信息
 * AllowBeanDefinitionOverriding:允许bean的定义信息可以覆盖
 * AllowCircularReferences:允许
 */
public class MyBfpp implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("=======================");
    }

}
