package com.app.teamProject.service;

import com.example.app.dao.MemberDAO;
import com.example.app.domain.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements com.example.app.service.MemberService {
    private final MemberDAO memberDAO;

    @Override
    public void join(MemberVO memberVO) {
        memberDAO.save(memberVO);
    }

    @Override
    public Optional<String> login(MemberVO memberVO) {
        return Optional.ofNullable(memberDAO.findMemberIdByMemberIdAndMemberPassword(memberVO));
    }

    @Override
    public Optional<String> checkId(String memberId) {
        return Optional.ofNullable(memberDAO.findMemberIdByMemberId(memberId));
    }
}
