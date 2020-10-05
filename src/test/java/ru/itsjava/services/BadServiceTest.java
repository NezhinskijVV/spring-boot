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
import ru.itsjava.dao.UserDaoJdbc;
import ru.itsjava.domain.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@DisplayName("Класс BadService: ")
public class BadServiceTest {
    @MockBean
    private UserDao userDao;

    @Autowired
    private BadService badService;

    @Configuration
    static class MyConf {
        @Bean
        public BadService badService(UserDao userDao){
            return new BadService(userDao);
        }
    }

    @Test
    @DisplayName(" корректно работает метод isBad")
    public void shouldCorrectIsBad() {
        Mockito.when(userDao.findByName("Ola"))
                .thenReturn(new User("Ola", 25));

        assertEquals(true,
                badService.isBad("Ola"));
    }
}