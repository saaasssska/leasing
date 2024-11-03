package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.UserDto;
import com.saaasssska.leasing.entity.User;
import com.saaasssska.leasing.mapper.UserMapper;
import com.saaasssska.leasing.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserMapper userMapper;

    @Override
    public Long createUser(UserDto userDto) {
        User user = userMapper.toUser(userDto);
        return userRepo.save(user).getId();
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public UserDto getUserById(Long id) {
        return userMapper.toUserDto(userRepo.findById(id).orElseThrow());
    }

    @Override
    public UserDto authUser(UserDto userDto) {
        return userRepo.findOneByLoginAndPassword(userDto.getLogin(), userDto.getPassword());
    }
}
