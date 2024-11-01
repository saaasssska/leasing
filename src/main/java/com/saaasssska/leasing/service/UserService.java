package com.saaasssska.leasing.service;

import com.saaasssska.leasing.dto.UserDto;

public interface UserService {
    Long createUser(UserDto userDto);
    void deleteUser(Long id);
    Long getUserById(Long id);
    Long authUser(UserDto userDto);
}
