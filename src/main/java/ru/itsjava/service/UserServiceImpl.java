package ru.itsjava.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.UserDao;

@Service
//@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("UserServiceImpl");
    }

    @Override
    public String sayHey(String name) {
        return name + " Hey!";
    }
}