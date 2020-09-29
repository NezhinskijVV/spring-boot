package ru.itsjava.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.dao.UserDao;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserServiceTest {

    @MockBean
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Configuration
    class Conf{
        @Bean
        public UserService userService(){
            return new UserServiceImpl(userDao);
        }
    }

    @Test
    public void shouldHaveCorrectGreeting() {
        assertEquals(userService.sayHey("Vitalik"), "Vitalik Hey!");
    }

}