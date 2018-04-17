package com.casic.mapper;

import com.casic.model.SysRes;

import java.util.List;

public interface SysResMapper {
    int deleteByPrimaryKey(Long resid);

    int insert(SysRes record);

    int insertSelective(SysRes record);

    SysRes selectByPrimaryKey(Long resid);

    int updateByPrimaryKeySelective(SysRes record);

    int updateByPrimaryKey(SysRes record);

    List<SysRes> getUrlAndRoleByAll();

}