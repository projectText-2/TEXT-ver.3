package com.app.teamProject.service;
import com.app.teamProject.domain.MemberVO;
import java.util.List;
import java.util.Optional;

public interface AdminService {
    //회원정보 목록
    public List<MemberVO> getList();

    //회원 디테일정보 (클릭시 나오는 화면)
    public Optional<MemberVO> getDetail(String Id);
}
