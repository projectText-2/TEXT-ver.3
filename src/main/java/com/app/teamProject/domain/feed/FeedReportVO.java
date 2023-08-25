package com.app.teamProject.domain.feed;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class FeedReportVO {

    private Long id;
    private String memberId; // 게시글 신고자의 아이디
    private Long feedId; // 게시글 ID(Long)




}
