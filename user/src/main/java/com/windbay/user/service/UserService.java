package com.windbay.user.service;

import com.windbay.user.dao.UserDao;
import com.windbay.user.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public UserPO getUserById(Long id) {
        return userDao.selectByPrimaryKey(id);
    }
}
