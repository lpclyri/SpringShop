package com.nighost.service;

import com.nighost.dao.UserDao;
import com.nighost.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUser() {
        List<User> list = userDao.getAllUser();
        return list;
    }

    public void storeUser(User user) {
        userDao.save(user);
    }
}
