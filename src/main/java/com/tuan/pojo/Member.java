package com.tuan.pojo;

public class Member {
    private Integer id;

    private Long phone;

    private String name;

    private String password;

    public Member(Integer id, Long phone, String name, String password) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.password = password;
    }

    public Member() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}