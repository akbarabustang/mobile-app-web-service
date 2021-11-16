package com.akbardev.app.mobileappws.ui.controller;

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
    public String createUsers()
    {
        return "post users";
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