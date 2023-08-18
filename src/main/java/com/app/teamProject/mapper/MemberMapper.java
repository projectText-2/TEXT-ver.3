package com.app.teamProject.mapper;

import com.app.teamProject.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
//    회원 가입
    public void insert(MemberVO memberVO);
//    로그인
    public String selectMemberId(MemberVO memberVO);
//    아이디 중복검사
    public String selectForIdCheck(String memberId);
//    마이페이지(회원 조회)
    public MemberVO select(String memberId);
}
