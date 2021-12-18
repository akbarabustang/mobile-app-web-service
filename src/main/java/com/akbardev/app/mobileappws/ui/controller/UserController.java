package com.akbardev.app.mobileappws.ui.controller;

import com.akbardev.app.mobileappws.ui.model.request.UserDetailsRequestModel;
import com.akbardev.app.mobileappws.ui.model.response.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUsers()
    {
        return "get users";
    }

    @PostMapping
    public UserRest createUsers(@RequestBody UserDetailsRequestModel userDetails)
    {
        return null;
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
