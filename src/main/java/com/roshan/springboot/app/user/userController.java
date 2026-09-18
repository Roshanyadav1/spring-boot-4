package com.roshan.springboot.app.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    // inject properties
    @Value("${user.name}")
    private String userName;

    @Value("${user.surname}")
    private String userSurname;

    // exposing the "/" endpoint
    @GetMapping("/")
    public String sayHello() {
        return "Hello roshan";
    }

    @GetMapping("/userinfo")
    public String getUserInfo(){
        return userName + " " + userSurname;
    }

    @GetMapping("/workout")
    public String dailyWorkOut(){
        return "This is working bro !";
    }
}
