package com.app.teamProject.mapper;

import com.app.teamProject.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.lang.reflect.Member;
import java.util.List;

@Mapper
public interface AdminMapper {
    //회원정보 목록
    public List<MemberVO> selectAll();


}
