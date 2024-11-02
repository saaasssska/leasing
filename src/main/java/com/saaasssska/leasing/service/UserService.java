package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.UserDto;
import com.saaasssska.leasing.entity.User;

public interface UserService {
    Long createUser(UserDto userDto);
    Long deleteUser(Long id);
    UserDto getUserById(Long id);
    User authUser(UserDto userDto);
}
