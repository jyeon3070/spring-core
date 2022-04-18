package com.spring.core.member;

public class Member {

    /**
     * 회원 ID
     */
    private Long id;

    /**
     * 회원 이름
     */
    private String name;

    /**
     * 등급 : BASIC, VIP
     */
    private Grade grade;

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
