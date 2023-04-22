package com.example.fastcampusmysql.domain.member.dto;

import java.time.LocalDate;


// 16부터 공식기능 >> getter setter 자동 설정 .email()로 사용가능
public record RegisterMemberCommand(
        String email,
        String nickname,
        LocalDate birthday
) {
}
