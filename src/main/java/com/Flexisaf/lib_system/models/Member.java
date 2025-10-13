package com.Flexisaf.lib_system.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class  Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private long member_id;

    @Column(name = "First_name")
    private String first_name;

    @Column(name = "Last_name")
    private String last_name;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phone_Number")
    private Integer phone_number;

    @Column(name = "Membership_date")
    private Date membership_date;

    public long getMember_id() {
        return member_id;
    }

    public void setMember_id(long member_id) {
        this.member_id = member_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public Date getMembership_date() {
        return membership_date;
    }

    public void setMembership_date(Date membership_date) {
        this.membership_date = membership_date;
    }
}
