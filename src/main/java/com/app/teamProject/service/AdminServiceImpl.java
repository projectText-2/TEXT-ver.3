package com.app.teamProject.service;

import com.app.teamProject.domain.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.app.teamProject.dao.AdminDAO;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final HttpSession session;
    private final AdminDAO adminDAO;

    @Override
    public List<MemberVO> getList(){
        return adminDAO.findAll();
    }

    //회원 디테일정보 (클릭시 나오는 화면)
    @Override
    public Optional<MemberVO> getDetail(String Id){
        return adminDAO.findById(Id);
    }
}
