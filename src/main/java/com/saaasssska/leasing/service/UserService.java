package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.UserDto;

public interface UserService {
    Long createUser(UserDto userDto);
    Long deleteUser(Long id);
    Long getUserById(Long id);
    Long authUser(UserDto userDto);
}
