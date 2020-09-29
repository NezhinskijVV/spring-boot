package ru.itsjava.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.UserDao;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Override
    public String sayHey(String name) {
        return name + " Hey!";
    }
}