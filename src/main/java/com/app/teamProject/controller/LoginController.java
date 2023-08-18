package com.app.teamProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("login/*")
public class LoginController {

    @GetMapping("findId")
    public void findId(){;}

    @GetMapping("findIdResult")
    public void findIdResult(){;}

    @GetMapping("findPw")
    public void findPw(){;}

    @GetMapping("findPwResult")
    public void findPwResult(){;}

    @GetMapping("login")
    public void login(){;}

    @GetMapping("nothingResult")
    public void nothingResult(){;}
}
