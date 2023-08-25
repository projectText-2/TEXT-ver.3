package com.app.teamProject.domain.together;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class TogetherReplyReportVO {

    private Long id;
    private String memberId; // 댓글 신고자의 ID
    private Long togetherReplyId; // 댓글 ID(Long)


}
