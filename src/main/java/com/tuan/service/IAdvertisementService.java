package com.tuan.service;

import com.tuan.dto.AdvertisementDTO;
import com.tuan.query.AdvertisementQuery;
import com.tuan.response.Response;

import java.util.List;

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

    /**
     * 条件查询返回符合条件的列表
     *
     * @param advertisementQuery
     * @return
     */
    Response<List<AdvertisementDTO>> selectListByQuery(AdvertisementQuery advertisementQuery);

    /**
     * 删除某条记录  物理删除
     * @param advertisementDTO
     * @return
     */
    Response<Boolean> delete(AdvertisementDTO advertisementDTO);

    /**
     * 更新一条记录
     * @param advertisementDTO
     * @return
     */
    Response<Long> update(AdvertisementDTO advertisementDTO);
}
