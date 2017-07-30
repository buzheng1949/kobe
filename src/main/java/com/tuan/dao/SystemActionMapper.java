package com.tuan.dao;

import com.tuan.pojo.SystemAction;

public interface SystemActionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemAction record);

    int insertSelective(SystemAction record);

    SystemAction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemAction record);

    int updateByPrimaryKey(SystemAction record);
}