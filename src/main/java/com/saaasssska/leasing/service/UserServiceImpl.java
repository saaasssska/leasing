package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.UserDto;
import com.saaasssska.leasing.mapper.UserMapper;
import com.saaasssska.leasing.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserMapper userMapper;
    @Override
    public Long createUser(UserDto userDto) {
        return null;
    }

    @Override
    public Long deleteUser(Long id) {
        return null;
    }

    @Override
    public Long getUserById(Long id) {
        return null;
    }

    @Override
    public Long authUser(UserDto userDto) {
        return null;
    }
}
