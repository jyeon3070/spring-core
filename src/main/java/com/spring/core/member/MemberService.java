package com.spring.core.member;

public interface MemberService {

    /**
     * 회원 가입
     * @param member
     */
    void join(Member member);

    /**
     * 회원 정보 조회
     * @param memberId : 회원 ID
     * @return : 해당 회원 정보 조회
     */
    Member findMember(Long memberId);

}
