package com.saaasssska.leasing.controller;

import com.saaasssska.leasing.dto.UserDto;
import com.saaasssska.leasing.repository.UserRepo;
import com.saaasssska.leasing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.saaasssska.leasing.controller.UserController.PATH;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(PATH)
public class UserController {
    public static final String PATH = "/api/user";
    public static final String ID_PATH = "/{id}";

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepo userRepo;

    @GetMapping(ID_PATH)
    public UserDto getUserById(@RequestParam Long id) {
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

    @GetMapping
    public UserDto authUser(@RequestParam Long userId, UserDto userDto) {
        return userService.authUser(userDto);
    }

}
