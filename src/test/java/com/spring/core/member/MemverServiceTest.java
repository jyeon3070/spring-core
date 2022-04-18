package com.spring.core.member;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemverServiceTest {

    MemberService memberService = new MemberServiceImpl();
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
