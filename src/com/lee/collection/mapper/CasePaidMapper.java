package com.lee.collection.mapper;

import com.lee.collection.entities.CasePaid;

public interface CasePaidMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CasePaid record);

    int insertSelective(CasePaid record);

    CasePaid selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CasePaid record);

    int updateByPrimaryKey(CasePaid record);
}