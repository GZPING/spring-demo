package com.petter.demo.config;

import com.petter.demo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : GD
 * @date :2020/6/30 : 22:07
 */
@Configuration
public class CreateBeansConfig {

    @Bean
    public User user(){
        User user = new User("name","man");
        return user;
    }
}
