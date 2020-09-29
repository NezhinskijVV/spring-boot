package ru.itsjava.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.service.MyService;

@Configuration
public class Config {

    @Bean
    @ConditionalOnProperty(value = "app.myService", havingValue = "true")
    public MyService myService(){
        return new MyService();
    }
}