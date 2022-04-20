package com.spring.core.order;

import com.spring.core.discount.DiscountPolicy;
import com.spring.core.member.Member;
import com.spring.core.member.MemberRepository;

public class OrderServiceImpl implements OrderService {

    /**
     * 메모리 회원 정보
     */
    private final MemberRepository memberRepository;
    /**
     * 정액, 정률 할인
     */
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
