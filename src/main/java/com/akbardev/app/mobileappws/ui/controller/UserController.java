package com.akbardev.app.mobileappws.ui.controller;

import com.akbardev.app.mobileappws.service.UserService;
import com.akbardev.app.mobileappws.shared.dto.UserDto;
import com.akbardev.app.mobileappws.ui.model.request.UserDetailsRequestModel;
import com.akbardev.app.mobileappws.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public String getUsers()
    {
        return "get users";
    }

    @PostMapping
    public UserRest createUsers(@RequestBody UserDetailsRequestModel userDetails)
    {
        UserRest returnValue = new UserRest();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateUsers()
    {
        return "update users";
    }

    @DeleteMapping
    public String deleteUsers()
    {
        return "delete users";
    }
}
