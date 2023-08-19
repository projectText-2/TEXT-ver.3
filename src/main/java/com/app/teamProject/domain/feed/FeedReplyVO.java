package com.app.teamProject.domain.feed;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@NoArgsConstructor
public class FeedReplyVO {

    private Long id;
    private String replyContent;
    private Date replyRegisterDate;
    private Date replyUpdateDate;
    private String memberId;
    private Long postId;



}
