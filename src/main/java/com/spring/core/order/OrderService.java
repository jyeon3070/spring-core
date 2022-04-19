package com.spring.core.order;

public interface OrderService {

    /**
     * 
     * @param memberId : 회원 ID
     * @param itemName : 상품명
     * @param itemPrice : 상품 가격
     * @return : 주문 결과 반환
     */
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
