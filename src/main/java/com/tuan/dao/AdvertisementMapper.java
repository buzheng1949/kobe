package com.tuan.dao;

import com.tuan.pojo.Advertisement;
import com.tuan.query.AdvertisementQuery;

import java.util.List;

public interface AdvertisementMapper {
    /**
     * 根据主键删除记录  物理删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入操作
     * @param record
     * @return
     */
    int insert(Advertisement record);

    /**
     * 有选择的插入操作
     * @param record
     * @return
     */
    int insertSelective(Advertisement record);

    /**
     * 根据ID查找记录
     * @param id
     * @return
     */
    Advertisement selectByPrimaryKey(Integer id);

    /**
     * 更新选中的字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Advertisement record);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKey(Advertisement record);

    /**
     * 分页查询
     * @param advertisementQuery
     * @return
     */
    List<Advertisement> selectByQuery(AdvertisementQuery advertisementQuery);
}