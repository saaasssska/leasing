package com.saaasssska.leasing.repository;

import com.saaasssska.leasing.dto.UserDto;
import com.saaasssska.leasing.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    UserDto findOneByLoginAndPassword(String login, String password);
}
