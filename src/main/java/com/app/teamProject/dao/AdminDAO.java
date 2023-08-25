package com.app.teamProject.dao;

import com.app.teamProject.domain.MemberVO;
import com.app.teamProject.mapper.AdminMapper;
import com.app.teamProject.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AdminDAO {
    private final AdminMapper adminMapper;

    //회원정보 목록
    public List<MemberVO> findAll(){ return adminMapper.selectAll();}

    //회원 디테일정보 (클릭시 나오는 화면)
    public Optional<MemberVO> findById(String Id){return adminMapper.selectDetail(Id);};
}
