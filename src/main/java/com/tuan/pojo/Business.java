package com.tuan.pojo;

import java.math.BigDecimal;

public class Business {
    private Integer id;

    private String imgFileName;

    private String title;

    private String subtitle;

    private BigDecimal price;

    private Integer distance;

    private Integer number;

    private String desc;

    private String city;

    private String category;

    private Integer starTotalNum;

    private Integer commentTotalNum;

    public Business(Integer id, String imgFileName, String title, String subtitle, BigDecimal price, Integer distance, Integer number, String desc, String city, String category, Integer starTotalNum, Integer commentTotalNum) {
        this.id = id;
        this.imgFileName = imgFileName;
        this.title = title;
        this.subtitle = subtitle;
        this.price = price;
        this.distance = distance;
        this.number = number;
        this.desc = desc;
        this.city = city;
        this.category = category;
        this.starTotalNum = starTotalNum;
        this.commentTotalNum = commentTotalNum;
    }

    public Business() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName == null ? null : imgFileName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getStarTotalNum() {
        return starTotalNum;
    }

    public void setStarTotalNum(Integer starTotalNum) {
        this.starTotalNum = starTotalNum;
    }

    public Integer getCommentTotalNum() {
        return commentTotalNum;
    }

    public void setCommentTotalNum(Integer commentTotalNum) {
        this.commentTotalNum = commentTotalNum;
    }
}