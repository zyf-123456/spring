package com.mashibing.k_overmethod;

import com.mashibing.k_overmethod.lookup.FruitPlate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author libin
 * @description
 * @date 2022-01-03
 */
public class MethodOverTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/k_overmethod/spring.xml");
//        Apple bean = ac.getBean(Apple.class);
//        System.out.println(bean.getBanana());
//        Apple bean2 = ac.getBean(Apple.class);
//        System.out.println(bean2.getBanana());
        FruitPlate fruitplate1 = (FruitPlate) ac.getBean("fruitplate1");
        fruitplate1.getFruit();
        FruitPlate fruitplate2 = (FruitPlate) ac.getBean("fruitplate1");
        fruitplate2.getFruit();
//        FruitPlate fruitplate2 = (FruitPlate) ac.getBean("fruitplate2");
//        fruitplate2.getFruit();
    }
}
