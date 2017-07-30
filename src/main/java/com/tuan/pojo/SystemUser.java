package com.tuan.pojo;

public class SystemUser {
    private Integer id;

    private String name;

    private String password;

    private String chName;

    private Integer groupId;

    public SystemUser(Integer id, String name, String password, String chName, Integer groupId) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.chName = chName;
        this.groupId = groupId;
    }

    public SystemUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName == null ? null : chName.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}