package com.app.teamProject.domain.feed;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class FeedReplyReportVO {

    private Long id;
    private String memberId; // 댓글 신고자의 ID
    private Long feedReplyId; // 댓글 ID(Long)




}
