package com.app.teamProject.controller;

import com.app.teamProject.domain.MemberVO;
import com.app.teamProject.exception.LoginFailedException;
import com.app.teamProject.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdminController {
    private final AdminService adminService;




    @GetMapping("adAllow")
    public void adAllow(){;}

    @GetMapping("adminHead")
    public void adminHead(){;}

    @GetMapping("allowDetail")
    public void allowDetail(){;}
    /* 회원 디테일 페이지*/
    @GetMapping("detailPage")
    public void detailPage(){;}

    @GetMapping("feedReportPost")
    public void feedReportPost(){;}
    /* 회원 리스트 -------------------------------------------------*/

    @GetMapping("memberList")
    public String memberList(Model model) {
        List<MemberVO> members = adminService.getList(); // AdminService를 사용하여 회원 목록을 가져옴
        model.addAttribute("items", members); // 뷰로 회원 목록을 전달
        return "/admin/memberList"; // 회원 목록을 표시할 뷰 페이지로 이동
    }


    @GetMapping("togetherReportPost")
    public void togetherReportPost(){;}

    @GetMapping("tradeReportPost")
    public void tradeReportPost(){;}
}
