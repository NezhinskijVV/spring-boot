package ru.itsjava.services;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.dao.UserDao;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@DisplayName("Класс GoodService:")
public class GoodServiceTest {
    @MockBean
    UserDao userDao;

    @Configuration
    static class MyConf {
        @Bean
        public GoodService goodService(UserDao userDao){
            return new GoodService(userDao);
        }
    }

    @Autowired
    GoodService goodService;

    @Test
    public void shouldBeGoodService() {
//        GoodService goodService = new GoodService();
        assertEquals(true, goodService.isGood());
    }
}
