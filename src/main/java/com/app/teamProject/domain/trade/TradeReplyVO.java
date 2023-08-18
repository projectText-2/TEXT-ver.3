package com.app.teamProject.domain.trade;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@NoArgsConstructor
@Component
public class TradeReplyVO {

    private Long id;
    private String replyContent;
    private Date replyRegisterDate;
    private Date replyUpdateDate;
    private String memberId;
    private Long postId;

}
