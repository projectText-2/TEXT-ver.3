package com.app.teamProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("dm/*")
public class DmController {

    @GetMapping("detail")
    public void detail(){;}

    @GetMapping("list")
    public void list(){;}
}
