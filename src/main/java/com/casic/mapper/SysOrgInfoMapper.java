package com.casic.mapper;

import com.casic.model.SysOrgInfo;

public interface SysOrgInfoMapper {

    int deleteByPrimaryKey(Long sysOrgInfoId);

    int insert(SysOrgInfo record);

    int insertSelective(SysOrgInfo record);

    SysOrgInfo selectByPrimaryKey(Long sysOrgInfoId);

    int updateByPrimaryKeySelective(SysOrgInfo record);

    int updateByPrimaryKey(SysOrgInfo record);
}