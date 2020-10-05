package ru.itsjava.services;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import ru.itsjava.dao.UserDao;

@ComponentScan("ru.itsjava.services")
@SpringBootConfiguration
public class TestSpringBootConfiguration {

//    @Bean
//    public GoodService goodService(UserDao userDao){
//        return new GoodService(userDao);
//    }
}