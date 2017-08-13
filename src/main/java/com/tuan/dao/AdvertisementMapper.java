package com.tuan.dao;

import com.tuan.pojo.Advertisement;
import com.tuan.query.AdvertisementQuery;

import java.util.List;

public interface AdvertisementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Advertisement record);

    int insertSelective(Advertisement record);

    Advertisement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Advertisement record);

    int updateByPrimaryKey(Advertisement record);

    List<Advertisement> selectByQuery(AdvertisementQuery advertisementQuery);
}