package com.example.fastcampusmysql.domain.member.entity;

import com.example.fastcampusmysql.domain.util.MemberFixtureFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberTest {
    @DisplayName("회원은 닉네임을 변경할 수 있다.")
    @Test
    public void testChangeName() {
        var member = MemberFixtureFactory.create();
        var expected = "pnu";

        member.changeNickName(expected);

        Assertions.assertEquals(expected, member.getNickname());
//        LongStream.range(0, 10)
//                .mapToObj(MemberFixtureFactory::create)
//                .forEach(member -> {
//                    System.out.println(member.getNickname());
//                });

    }

    @DisplayName("회원의 닉네임은 10자를 초과할수 없다")
    @Test
    public void testNicknameMaxLength(){
        var member = MemberFixtureFactory.create();
        var overMaxLengthName = "pnupnupnupnupnupnu";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            member.changeNickName(overMaxLengthName);
        });
    }
 }
