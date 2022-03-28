package com.energyfragment.mybatismultidatasource.business.user.controller;

import com.energyfragment.mybatismultidatasource.business.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author  zhangnbr
 * @date    2022-03-27
 * @desc    测试web方法-controller
 */
@RestController
@RequestMapping("UserController")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("hello")
    public String hello(){
        String msg = userService.getUserName("11","1");
        return "Hello "+ msg;
    }
}