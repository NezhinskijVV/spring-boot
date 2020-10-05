package ru.itsjava.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.UserDao;

@Service
@AllArgsConstructor
public class GoodService {
    private final UserDao userDao;

    public boolean isGood(){
        return true;
    }
}
