package com.app.teamProject.service;
import com.app.teamProject.domain.MemberVO;
import java.util.List;

public interface AdminService {
    //회원정보 목록
    public List<MemberVO> getList();
}
