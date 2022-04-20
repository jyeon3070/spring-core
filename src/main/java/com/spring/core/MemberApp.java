package com.spring.core;

import com.spring.core.member.Grade;
import com.spring.core.member.Member;
import com.spring.core.member.MemberService;

public class MemberApp {

    public static void main(String[] args) {
        /**
         * Member Service
         */
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        //MemberService memberService = new MemberServiceImpl();

        Member member = new Member(2L, "송지연", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(2L);

        System.out.println(member.getName());
        System.out.println(findMember.getName());




    }
}
