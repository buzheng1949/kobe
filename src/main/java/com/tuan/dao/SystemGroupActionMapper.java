package com.tuan.dao;

import com.tuan.pojo.SystemGroupAction;

public interface SystemGroupActionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemGroupAction record);

    int insertSelective(SystemGroupAction record);

    SystemGroupAction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemGroupAction record);

    int updateByPrimaryKey(SystemGroupAction record);
}