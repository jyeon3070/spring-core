package com.spring.core;

import com.spring.core.member.Grade;
import com.spring.core.member.Member;
import com.spring.core.member.MemberService;
import com.spring.core.member.MemberServiceImpl;
import com.spring.core.order.Order;
import com.spring.core.order.OrderService;
import com.spring.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        /**
         * Member Service
         */
        MemberService memberService = new MemberServiceImpl();
        /**
         * Order Service
         */
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 2L;
        Member member = new Member(memberId, "송지연", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 30000);

        System.out.println("order = " + order);
    }
}
