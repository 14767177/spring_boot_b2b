package com.casic.mapper;

import com.casic.model.SysOrg;

import java.util.Map;

public interface SysOrgMapper {

    int deleteByPrimaryKey(Long orgid);

    int insert(SysOrg record);

    int insertSelective(SysOrg record);

    SysOrg selectByPrimaryKey(Long orgid);

    int updateByPrimaryKeySelective(SysOrg record);

    int updateByPrimaryKey(SysOrg record);

    Map<String,Object> getOrgByorgid(Long orgid);
}