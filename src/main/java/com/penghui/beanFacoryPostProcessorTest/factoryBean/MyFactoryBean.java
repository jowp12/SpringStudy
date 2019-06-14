package com.penghui.beanFacoryPostProcessorTest.factoryBean;

import com.penghui.beanFacoryPostProcessorTest.entity.User;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUsername("factoryBeanUsername");
        user.setPassword("factoryBeanPassword");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
