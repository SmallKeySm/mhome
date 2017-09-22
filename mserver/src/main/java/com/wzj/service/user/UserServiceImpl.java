package com.wzj.service.user;

import com.wzj.dao.user.UserDao;
import com.wzj.model.user.User;
import com.wzj.spi.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService<User, Long> {
    @Autowired
    UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public User findOne(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public User save(User user) {
        return userDao.save(user);
    }
}
