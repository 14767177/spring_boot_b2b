package com.casic.mapper;

import com.casic.model.SysUserRole;

public interface SysUserRoleMapper {
    int deleteByPrimaryKey(Long userroleid);

    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);

    SysUserRole selectByPrimaryKey(Long userroleid);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole record);
}