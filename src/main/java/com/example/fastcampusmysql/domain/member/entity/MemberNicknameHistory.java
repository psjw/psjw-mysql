package com.example.fastcampusmysql.domain.member.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemberNicknameHistory {
    private final Long id;
    private final Long memberId;
    private final String nickname;
    private final LocalDateTime createdAt;

    @Builder
    public MemberNicknameHistory(Long id, Long memberId, String nickname, LocalDateTime createdAt) {
        this.id = id;
        this.memberId = memberId;
        this.nickname = nickname;
        this.createdAt = createdAt;
    }
}
