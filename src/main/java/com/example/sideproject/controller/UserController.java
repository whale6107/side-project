package com.example.sideproject.controller;

import java.security.Principal;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sideproject.vo.User;

@RestController
public class UserController {


	@RequestMapping("/api/login")
    public boolean login(@RequestBody User user) {
		System.out.println("user:" + user.getUserName());
		System.out.println("pwd:" + user.getPassword());
        return
          user.getUserName().equals("Ricky") && user.getPassword().equals("123");
    }
     
    @RequestMapping("/api/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
          .substring("Basic".length()).trim();
        System.out.println("authToken:" + authToken);
        return () ->  new String(Base64.getDecoder()
          .decode(authToken)).split(":")[0];
    }
}
