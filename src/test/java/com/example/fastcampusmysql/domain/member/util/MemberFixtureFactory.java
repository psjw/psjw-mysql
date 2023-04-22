package com.example.fastcampusmysql.domain.member.util;

import com.example.fastcampusmysql.domain.member.entity.Member;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

public class MemberFixtureFactory {
    static  public Member create(){
        var param = new EasyRandomParameters();
        return new EasyRandom(param)
                .nextObject(Member.class);
    }
    static public Member create(Long seed){
        //objectMother패턴
        //동일한 시드로 만들면 똑같은 값을 가지는 객체가 생성
        var param = new EasyRandomParameters()
                .seed(seed);
        return new EasyRandom(param)
                .nextObject(Member.class);
    }
}
