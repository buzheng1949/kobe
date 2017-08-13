package com.tuan.pojo;

import com.tuan.dto.AdvertisementDTO;
import org.springframework.beans.BeanUtils;

public class Advertisement {
    private Integer id;

    private String title;

    private String imgFileName;

    private String link;

    private Integer weight;

    public Advertisement(Integer id, String title, String imgFileName, String link, Integer weight) {
        this.id = id;
        this.title = title;
        this.imgFileName = imgFileName;
        this.link = link;
        this.weight = weight;
    }

    public Advertisement() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName == null ? null : imgFileName.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 将DO转化为DTO
     * @param advertisement
     * @return
     */
    public static AdvertisementDTO toDTO(Advertisement advertisement) {
        AdvertisementDTO advertisementDTO = new AdvertisementDTO();
        BeanUtils.copyProperties(advertisement, advertisementDTO);
        return advertisementDTO;
    }
}