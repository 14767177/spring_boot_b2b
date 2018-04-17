package com.casic.mapper;

import com.casic.model.SysUser;

import java.util.List;

public interface SysUserMapper {

    int deleteByPrimaryKey(Long userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long userid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser findByUsername(String username);

    List<SysUser> getAccountLike(String account);
}