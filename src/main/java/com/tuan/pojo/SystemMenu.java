package com.tuan.pojo;

public class SystemMenu {
    private Integer id;

    private String name;

    private String url;

    private Integer parentId;

    private Integer orderNum;

    public SystemMenu(Integer id, String name, String url, Integer parentId, Integer orderNum) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.parentId = parentId;
        this.orderNum = orderNum;
    }

    public SystemMenu() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}