package com.spring.core.discount;

import com.spring.core.member.Grade;
import com.spring.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10; // 1000원 할인

    /**
     * 정률 할인
     * @param member : 회원 정보
     * @param price : 상품 가격
     * @return 할인 대상 금액
     */
    @Override
    public int discount(Member member, int price) {

        if(member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        }else {
            return 0;
        }
    }

}
