package com.casic.mapper;

import com.casic.model.SysRole;

import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long roleid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long roleid);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    List<SysRole> getroleListByuser(String name);
}