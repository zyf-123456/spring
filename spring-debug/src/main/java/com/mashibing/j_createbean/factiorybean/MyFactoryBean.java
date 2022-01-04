package com.mashibing.j_createbean.factiorybean;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        //任何创建对象的操作
        return new User("zhangsan");
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
