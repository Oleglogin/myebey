package ua.lv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lv.dao.UserDao;
import ua.lv.entity.User;
import ua.lv.service.UserService;

import java.util.List;

/**
 * Created by User on 15.01.2021.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.findOne(id);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }

    @Override
    public User findByUserName(String username) {
        return userDao.findByUserName(username);
    }
}
