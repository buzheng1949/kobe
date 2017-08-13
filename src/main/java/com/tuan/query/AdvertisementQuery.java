package com.tuan.query;

import javax.management.Query;

/**
 * Created by buzheng on 17/8/13.
 * 广告查询类
 */
public class AdvertisementQuery extends BaseQuery {

    private String title;

    private String imgFileName;

    private String link;

    private Integer weight;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
