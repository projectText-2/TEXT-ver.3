package com.app.teamProject.mapper;
import com.app.teamProject.domain.MemberVO;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AdminMapperTests {
    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void selectAllTest(){
       adminMapper.selectAll();
       log.info("{}......ddd",adminMapper.selectAll());
    }



}
