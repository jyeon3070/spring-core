package com.spring.core.member;

public interface MemberRepository {
    /**
     * 회원 정보 저장(회원가입)
     * @param member
     */
    void save(Member member);

    /**
     * 회원 정보 조회
     * @param memberId : 회원 ID
     * @return : 해당 회원 정보 조회
     */
    Member findById(Long memberId);
}
