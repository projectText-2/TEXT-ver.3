package com.app.teamProject.domain.trade;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class TradeVO {

    private Long id;
    private String title;
    private String content;
    private String tagCode;
    private int likeCount;
    private String status;
    private String memberId;


}
