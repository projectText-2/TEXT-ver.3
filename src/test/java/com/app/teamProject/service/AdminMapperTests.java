package com.app.teamProject.service;
import com.app.teamProject.domain.MemberVO;
import com.app.teamProject.mapper.AdminMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AdminMapperTests {
    @Autowired
    private AdminMapper adminMapper;
    @Test
    public void selectAllTest(){
        adminMapper.selectAll().stream().map(MemberVO::toString).forEach(log::info);
    }
    @Test
    public void selectDetailTest(){ adminMapper.selectDetail("id1").stream().map(MemberVO::toString).forEach(log::info);}
}
