package com.app.teamProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("trade/*")
public class TradeController {

    @GetMapping("trade")
    public void trade(){;}

    @GetMapping("tradeCreate")
    public void tradeCreate(){;}

    @GetMapping("tradeDetailPage")
    public void tradeDetailPage(){;}
}
