package com.tuan.service;

import com.tuan.dto.AdvertisementDTO;
import com.tuan.response.Response;

/**
 * Created by buzheng on 17/7/31.
 * 广告新增删除接口
 */
public interface IAdvertisementService {
    /**
     * 新增广告
     *
     * @param advertisementDTO
     * @return
     */
    Response<Long> addAdvertisement(AdvertisementDTO advertisementDTO);
}
