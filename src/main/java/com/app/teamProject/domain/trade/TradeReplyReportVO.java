package com.app.teamProject.domain.trade;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class TradeReplyReportVO {

    private Long id;
    private String memberId; // 댓글 신고자의 ID
    private Long tradeReplyId; // 댓글 ID(Long)
}
