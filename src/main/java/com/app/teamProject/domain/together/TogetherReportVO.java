package com.app.teamProject.domain.together;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class TogetherReportVO {

    private Long id;
    private String memberId; // 게시글 신고자의 아이디
    private Long togetherId; // 게시글 ID(Long)





}
