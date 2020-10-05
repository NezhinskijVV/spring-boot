package ru.itsjava.dao;

import org.springframework.stereotype.Repository;
import ru.itsjava.domain.User;

@Repository
public class UserDaoJdbc implements UserDao {

    public UserDaoJdbc() {
        System.out.println("UserDaoJdbc");
    }

    //JDBC код (будем ходить в базу)
    @Override
    public User findByName(String name) {
        return new User("I'm from DB", 25);
    }
}
