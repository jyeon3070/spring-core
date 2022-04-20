package com.spring.core.member;


import com.spring.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemverServiceTest {
    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        // MemberService memberService = new MemberServiceImpl;
    }

    @Test
    void join(){
        //given
        Member member = new Member(2L, "송지연", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(2L);

        System.out.println(member.getName());

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
