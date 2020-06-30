package com.petter.demo.beans;

import com.petter.demo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author : GD
 * @date :2020/6/30 : 22:03
 */
class XmlFileApplicationContextTest {

    @Test
    void classPathXmlApplicationContext() {
        BeanFactory bf = new ClassPathXmlApplicationContext("application.xml");
        User user = (User)bf.getBean("user");
        System.out.println(user);
    }

    @Test
    void xmlApplicationContextBySystemFile() {
        BeanFactory bf = new FileSystemXmlApplicationContext("G:\\src\\spring-demo\\src\\main\\resources\\application.xml");
        User user = (User)bf.getBean("user");
        System.out.println(user);
    }
}
