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

    @Test /*회원정보목록*/
    public void selectAllTest(){
       adminMapper.selectAll();
       log.info("{}......ddd",adminMapper.selectAll());
    }

    @Test /* 회원 디테일 */
    public void selectDetailTest(){
        adminMapper.selectDetail("id1");
        log.info("{}.............회원디테일",adminMapper.selectDetail("id1"));
    }


}
