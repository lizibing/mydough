package com.lu.mydough.service.impl;

import com.lu.mydough.dao.UserMapper;
import com.lu.mydough.domain.User;
import com.lu.mydough.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lu on 2016/7/28.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {

        return userMapper.getUsers();
    }
}
