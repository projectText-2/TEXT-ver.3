package com.app.teamProject.controller;

import com.app.teamProject.domain.MemberVO;
import com.app.teamProject.exception.LoginFailedException;
import com.app.teamProject.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("login/*")
public class LoginController {
    private final LoginService loginService;

    @GetMapping("findId")
    public void findId(){;}

    @GetMapping("findIdResult")
    public void findIdResult(){;}

    @GetMapping("findPw")
    public void findPw(){;}

    @GetMapping("findPwResult")
    public void findPwResult(){;}

    @GetMapping("login")
    public void login(MemberVO memberVO){;}

    @PostMapping("login")
    public RedirectView loginOk(MemberVO memberVO, HttpSession session){
//        session.setAttribute("memberId", loginService.login(memberVO).orElseThrow(() -> {throw new LoginFailedException("아이디 또는 비밀번호 오류");}));
        memberVO = loginService.login(memberVO).orElseThrow(() -> {throw new LoginFailedException("아이디 또는 비밀번호 오류");});
        session.setAttribute("memberId", memberVO.getId());
        session.setAttribute("memberName", memberVO.getName());
        return new RedirectView("/index/index");
    }

    @GetMapping("nothingResult")
    public void nothingResult(){;}
}
