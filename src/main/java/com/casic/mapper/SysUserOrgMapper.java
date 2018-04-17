package com.casic.mapper;

import com.casic.model.SysUserOrg;

public interface SysUserOrgMapper {
    int deleteByPrimaryKey(Long userorgid);

    int insert(SysUserOrg record);

    int insertSelective(SysUserOrg record);

    SysUserOrg selectByPrimaryKey(Long userorgid);

    int updateByPrimaryKeySelective(SysUserOrg record);

    int updateByPrimaryKey(SysUserOrg record);
}