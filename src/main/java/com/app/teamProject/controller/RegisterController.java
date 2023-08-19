package com.app.teamProject.controller;

import com.app.teamProject.domain.MemberVO;
import com.app.teamProject.service.RegisterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Parameter;

@Controller
@RequiredArgsConstructor
@RequestMapping("register/*")
@Slf4j
public class RegisterController {
    private final RegisterService registerService;

    @GetMapping("registerMain")
    public void registerMain(){;}

//    회원가입 페이지 연결
    @GetMapping("registerNext")
    public void registerNext(MemberVO memberVO){;}
//    회원가입
    @PostMapping("registerNext")
    public RedirectView join(MemberVO memberVO){
//        null값이 들어가면 오류나서 빈 값을 던지게 만듦
        memberVO.setImg("");
        registerService.join(memberVO);
        return new RedirectView("/register/registerOk");
    }

    @GetMapping("/checkid")
    @ResponseBody
    public boolean checkId(String ID){
        return registerService.checkId(ID).isPresent();
    }

    @GetMapping("registerOk")
    public void registerOk(){;}
}
