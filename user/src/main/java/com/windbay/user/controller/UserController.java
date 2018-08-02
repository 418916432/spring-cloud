package com.windbay.user.controller;

import com.windbay.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user-service/user")
    @ResponseBody
    public String getUser(HttpServletRequest request) {
        Long userId = Long.parseLong(request.getParameter("id"));
        return userService.getUserById(userId).toString();
    }
}
