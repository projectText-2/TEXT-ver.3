package com.app.teamProject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class MemberVO {
    private Long id;
    private String pw;
    private String name;
    private String hp;
    private String img;
    private String sort; /*(회원구분:일반n, 관리자m, 공식o, 제제b, dm차단d, 비공개p, 탈퇴e) */

}