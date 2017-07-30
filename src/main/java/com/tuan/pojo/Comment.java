package com.tuan.pojo;

import java.util.Date;

public class Comment {
    private Integer id;

    private Integer ordersId;

    private String comment;

    private Integer star;

    private Date createTime;

    public Comment(Integer id, Integer ordersId, String comment, Integer star, Date createTime) {
        this.id = id;
        this.ordersId = ordersId;
        this.comment = comment;
        this.star = star;
        this.createTime = createTime;
    }

    public Comment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}