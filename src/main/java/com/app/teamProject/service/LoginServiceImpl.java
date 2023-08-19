package com.app.teamProject.service;

import com.app.teamProject.dao.LoginDAO;
import com.app.teamProject.domain.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    private final LoginDAO loginDAO;

    @Override
    public Optional<String> login(MemberVO memberVO) {
        return Optional.ofNullable(loginDAO.findIDByID(memberVO));
    }
}
