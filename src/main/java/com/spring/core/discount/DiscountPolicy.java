package com.spring.core.discount;

import com.spring.core.member.Member;

public interface DiscountPolicy {

    /**
     * 할인 대상 금액
     * @param member : 회원 정보
     * @param price : 상품 가격
     * @return : 할인 대상 금액
     */
    int discount(Member member, int price);
}
