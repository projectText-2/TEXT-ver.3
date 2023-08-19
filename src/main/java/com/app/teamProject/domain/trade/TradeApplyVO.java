package com.app.teamProject.domain.trade;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class TradeApplyVO {

    private Long id;
    private String title;
    private String content;
    private String tagCode;
    private String status;
    private String memberId; /* 회원 아이디 */
    private Long postId; /* 게시물 번호 */

}
