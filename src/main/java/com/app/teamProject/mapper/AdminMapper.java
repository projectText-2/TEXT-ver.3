package com.app.teamProject.mapper;

import com.app.teamProject.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

@Mapper
public interface AdminMapper {
    //회원정보 목록
    public List<MemberVO> selectAll();

    //회원 디테일정보 (클릭시 나오는 화면)
    public Optional<MemberVO> selectDetail(String Id);

}
