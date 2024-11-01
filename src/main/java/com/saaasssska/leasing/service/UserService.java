package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.UserDto;

public interface UserService {
    Long createUser(UserDto userDto);
    Long deleteUser(Long id);
    Long updateUser(UserDto userDto);
    Long getUserById(Long id);
}
