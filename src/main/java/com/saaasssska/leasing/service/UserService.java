package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.UserDto;

public interface UserService {
    Long createUser(UserDto userDto);
    void deleteUser(Long id);
    UserDto getUserById(Long id);
    UserDto authUser(UserDto userDto);
}
