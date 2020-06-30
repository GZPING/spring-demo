package com.petter.demo.beans;

import com.petter.demo.User;
import com.petter.demo.config.CreateBeansConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : GD
 * @date :2020/6/30 : 22:11
 */
class AnnotationApplicationContextTest {

    @Test
    void annotationApplicationContextByBasePackages() {
        BeanFactory bf = new AnnotationConfigApplicationContext("com.petter.demo.config");
        User user = (User)bf.getBean("user");
        System.out.println(user);
    }

    @Test
    void annotationApplicationContextByClass() {
        BeanFactory bf = new AnnotationConfigApplicationContext(CreateBeansConfig.class);
        User user = (User)bf.getBean("user");
        System.out.println(user);
    }
}
