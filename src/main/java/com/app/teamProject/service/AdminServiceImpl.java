package com.app.teamProject.service;

import com.app.teamProject.domain.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.app.teamProject.dao.AdminDAO;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final HttpSession session;
    private final AdminDAO adminDAO;

    @Override
    public List<MemberVO> getList(){
        return adminDAO.findAll();
    }
}
