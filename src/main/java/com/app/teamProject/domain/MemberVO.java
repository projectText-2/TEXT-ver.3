package com.app.teamProject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class MemberVO {
    private String ID;
    private String PW;
    private String NAME;
    private String HP;
    private String IMG;
    private String SORT;
}
