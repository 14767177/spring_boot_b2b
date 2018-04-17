package com.casic.mapper;

import com.casic.model.SysRoleRes;

public interface SysRoleResMapper {
    int deleteByPrimaryKey(Long roleresid);

    int insert(SysRoleRes record);

    int insertSelective(SysRoleRes record);

    SysRoleRes selectByPrimaryKey(Long roleresid);

    int updateByPrimaryKeySelective(SysRoleRes record);

    int updateByPrimaryKey(SysRoleRes record);
}