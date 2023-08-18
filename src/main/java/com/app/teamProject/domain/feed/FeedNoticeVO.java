package com.app.teamProject.domain.feed;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class FeedNoticeVO {

    private long id;
    private String memberID;
    private String noticeId;
    private String noticeCheck;



}
