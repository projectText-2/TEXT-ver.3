package com.app.teamProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("mypage/*")
public class MypageController {

    @GetMapping("create")
    public void create(){;}

    @GetMapping("follow")
    public void follow(){;}

    @GetMapping("mypage")
    public void mypage(){;}

    @GetMapping("myTogetherList")
    public void myTogetherList(){;}

    @GetMapping("myTradeList")
    public void myTradeList(){;}

    @GetMapping("myupdate")
    public void myupdate(){;}

    @GetMapping("notice")
    public void notice(){;}
}
