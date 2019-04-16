package com.example.sideproject.controller;

import java.security.Principal;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sideproject.model.JwtUser;
import com.example.sideproject.util.JwtTokenUtil;
import com.example.sideproject.vo.User;

@RestController
public class UserController {

    @Autowired
    @Qualifier("jwtUserDetailsService")
    private UserDetailsService userDetailsService;
    
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    
	@RequestMapping("/api/login")
    public boolean login(@RequestBody User user) {
		System.out.println("user:" + user.getUserName());
		System.out.println("pwd:" + user.getPassword());
        return
          user.getUserName().equals("Ricky") && user.getPassword().equals("123");
    }
     
    @RequestMapping("/api/user")
    public JwtUser user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization").replace("Bearer ", "");
        System.out.println("authToken:" + authToken);
        String username = jwtTokenUtil.getUsernameFromToken(authToken);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
        return user;
    }
}
