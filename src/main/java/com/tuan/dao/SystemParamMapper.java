package com.tuan.dao;

import com.tuan.pojo.SystemParam;

public interface SystemParamMapper {
    int insert(SystemParam record);

    int insertSelective(SystemParam record);
}