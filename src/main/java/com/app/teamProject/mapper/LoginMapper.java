package com.app.teamProject.mapper;

import com.app.teamProject.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    public String select(MemberVO memberVO);
}
