package ru.itsjava.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.UserDao;

@Service
//@AllArgsConstructor
public class BadService {
    private final UserDao userDao;

    public BadService(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("Bad service");
    }

    public boolean isBad(String name) {
        if (userDao.findByName(name) != null) {
            return true;
        }
        return false;
    }
}
