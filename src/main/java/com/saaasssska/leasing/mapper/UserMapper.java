package com.saaasssska.leasing.mapper;

import com.saaasssska.leasing.dto.UserDto;
import com.saaasssska.leasing.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toUserDto(User user);
    User toUser(UserDto userDto);
}
