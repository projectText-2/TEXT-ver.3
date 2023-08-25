package com.app.teamProject.controller;

import com.app.teamProject.domain.MemberVO;
import com.app.teamProject.exception.LoginFailedException;
import com.app.teamProject.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

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
    /* 회원 디테일 페이지-------------------------------------------*/
    @GetMapping("detailPage")

    public String detailPage(Model model, @RequestParam("Id") String Id) {
        Optional<MemberVO> memberDetail = adminService.getDetail("id1");

        // 'Id' 파라미터가 없을 경우에 대한 처리
        if (!memberDetail.isPresent()) {
            // 여기에서 에러 처리나 리다이렉션 등을 수행할 수 있습니다.
            // 예를 들어, 회원을 찾을 수 없다면 에러 페이지로 리다이렉션하는 것이 가능합니다.
            return "errorPage"; // 에러 페이지로 이동하도록 수정하세요.
        }

        model.addAttribute("memberDetail", memberDetail.get());
        return "admin/detailPage"; // 회원 상세 정보 페이지로 이동
    }



    @GetMapping("feedReportPost")
    public void feedReportPost(){;}
    /* 회원 리스트 -------------------------------------------------*/

    @GetMapping("memberList")
    public String memberList(Model model) {
        List<MemberVO> members = adminService.getList(); // AdminService를 사용하여 회원 목록을 가져옴
        model.addAttribute("items", members); // 뷰로 회원 목록을 전달
        return "admin/memberList"; // 회원 목록을 표시할 뷰 페이지로 이동
    }


    @GetMapping("togetherReportPost")
    public void togetherReportPost(){;}

    @GetMapping("tradeReportPost")
    public void tradeReportPost(){;}
}
