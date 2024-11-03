package com.saaasssska.leasing.controller;

import com.saaasssska.leasing.dto.UserDto;
import com.saaasssska.leasing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.saaasssska.leasing.controller.UserController.PATH;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(PATH)
public class UserController {
    public static final String PATH = "/api/users";
    public static final String ID_PATH = "/{id}";
    public static final String AUTH_PATH = "/auth";

    @Autowired
    private UserService userService;

    @GetMapping(ID_PATH)
    public UserDto getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public Long create(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    @DeleteMapping(ID_PATH)
    public void delete(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PostMapping(AUTH_PATH)
    public Long authUser(@RequestParam Long userId, UserDto userDto) {
        return userService.authUser(userDto);
    }

}
