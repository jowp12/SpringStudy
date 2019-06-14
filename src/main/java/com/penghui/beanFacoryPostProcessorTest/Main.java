package com.penghui.beanFacoryPostProcessorTest;

import com.penghui.beanFacoryPostProcessorTest.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 123123
 * asdf
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)applicationContext.getBean("user1");
        System.out.println(user);
        ((ClassPathXmlApplicationContext) applicationContext).close();
//        System.out.println(user.toString());

    }
}
