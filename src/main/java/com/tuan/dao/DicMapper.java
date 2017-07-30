package com.tuan.dao;

import com.tuan.pojo.Dic;
import com.tuan.pojo.DicKey;

public interface DicMapper {
    int deleteByPrimaryKey(DicKey key);

    int insert(Dic record);

    int insertSelective(Dic record);

    Dic selectByPrimaryKey(DicKey key);

    int updateByPrimaryKeySelective(Dic record);

    int updateByPrimaryKey(Dic record);
}