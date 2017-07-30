package com.tuan.dao;

import com.tuan.pojo.SystemGroup;

public interface SystemGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemGroup record);

    int insertSelective(SystemGroup record);

    SystemGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemGroup record);

    int updateByPrimaryKey(SystemGroup record);
}