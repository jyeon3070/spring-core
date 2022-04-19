package com.spring.core.discount;

import com.spring.core.member.Grade;
import com.spring.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; // 1000원 할인

    /**
     * 정액 할인
     * @param member : 회원 정보
     * @param price : 상품 가격
     * @return 할인 대상 금액
     */
    @Override
    public int discount(Member member, int price) {

        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }else {
            return 0;
        }
    }

}
