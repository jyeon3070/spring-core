package com.spring.core;

import com.spring.core.member.Grade;
import com.spring.core.member.Member;
import com.spring.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {
        /**
         * Member Service
         */
        // AppConfig appConfig = new AppConfig();
        // MemberService memberService = appConfig.memberService();
        // MemberService memberService = new MemberServiceImpl();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(2L, "송지연", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(2L);

        System.out.println(member.getName());
        System.out.println(findMember.getName());




    }
}
