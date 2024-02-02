package com.sik.vo;

import org.springframework.stereotype.Repository;

@Repository
public class Member {


    private int no;
    private String name;
    private String email;


    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
