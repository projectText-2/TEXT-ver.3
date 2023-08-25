package com.app.teamProject.domain.report;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class ReportVO {

    private Long id;
    private String memberId; // reported 사람의 아이디(String)
    private Long reportId; // 신고된 '게시글' 또는 '댓글' 의 ID(Long)!! 가 들어감
    private String reportType; // '게시글' 또는 '댓글'



}
