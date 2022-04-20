package com.spring.core.order;

import com.spring.core.discount.DiscountPolicy;
import com.spring.core.discount.FixDiscountPolicy;
import com.spring.core.discount.RateDiscountPolicy;
import com.spring.core.member.Member;
import com.spring.core.member.MemberRepository;
import com.spring.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    /**
     * 메모리 회원 정보
     */
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    /**
     * 정액 할인
     */
    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    /**
     * 정률 할인
      */
    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
