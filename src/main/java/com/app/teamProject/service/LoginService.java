package com.app.teamProject.service;

import com.app.teamProject.domain.MemberVO;

import java.util.Optional;

public interface LoginService {
    public Optional<String> login(MemberVO memberVO);
}
