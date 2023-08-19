package com.app.teamProject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class DmVO {

    private Long id;
    private String memberId;
    private String name;
    private String sendId;
    private String sendName;
    private String content;
    private String dmCheck;

}
