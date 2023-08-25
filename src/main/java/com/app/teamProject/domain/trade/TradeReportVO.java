package com.app.teamProject.domain.trade;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class TradeReportVO {

    private Long id;
    private String memberId; // 게시글 신고자의 아이디
    private Long tradeId; // 게시글 ID(Long)



}
