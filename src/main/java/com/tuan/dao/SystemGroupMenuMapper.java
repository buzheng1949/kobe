package com.tuan.dao;

import com.tuan.pojo.SystemGroupMenu;

public interface SystemGroupMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemGroupMenu record);

    int insertSelective(SystemGroupMenu record);

    SystemGroupMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemGroupMenu record);

    int updateByPrimaryKey(SystemGroupMenu record);
}