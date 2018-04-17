package com.casic.service;

import com.casic.mapper.SysUserMapper;
import com.casic.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LRN on 2017/12/19.
 */
@Service
public class SysUserSercvice {

    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser getSysUserById(Long userid){
       return sysUserMapper.selectByPrimaryKey(userid);
    }

    public int saveUser(SysUser sysuser){
        int insert = sysUserMapper.insert(sysuser);
        return insert;
    }

    public SysUser getSysUserByUsername(String username){
        return sysUserMapper.findByUsername(username);
    }


    public List<SysUser> findAccountLike(String account) {
        List<SysUser> accountLike = sysUserMapper.getAccountLike(account);
        return accountLike;
    }
}
