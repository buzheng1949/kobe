package com.tuan.dto;

import com.tuan.pojo.Advertisement;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.beans.BeanUtils;

/**
 * Created by buzheng on 17/7/31.
 * 数据传输类
 */
public class AdvertisementDTO extends Advertisement {


    /**
     * 将DTO转化为DO
     * @param advertisementDTO
     * @return
     */
    public static Advertisement toDO(AdvertisementDTO advertisementDTO) {
        Advertisement advertisement = new Advertisement();
        BeanUtils.copyProperties(advertisementDTO, advertisement);
        return advertisement;
    }
}
