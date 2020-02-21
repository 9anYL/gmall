package com.gan.gmall.user.service.impl;

import com.gan.gmall.user.bean.UmsUser;
import com.gan.gmall.user.mapper.UserMapper;
import com.gan.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsUser> getAllUser() {
        return userMapper.selectAllUser();
    }
}
