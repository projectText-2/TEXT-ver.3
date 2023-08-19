package com.app.teamProject.dao;

import com.app.teamProject.domain.MemberVO;
import com.app.teamProject.mapper.LoginMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LoginDAO {
    private final LoginMapper loginMapper;

    public String findIDByID(MemberVO memberVO){
        return loginMapper.select(memberVO);
    }
}
