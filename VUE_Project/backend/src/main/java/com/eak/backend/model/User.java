package com.eak.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="user_table")
public class User {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String first_name;

    private String last_name;

    private String pNo;

    private String gender;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getpNo() {
        return pNo;
    }

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
