package com.casic.service;

import com.casic.mapper.SysRoleMapper;
import com.casic.model.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LRN on 2018/1/4.
 */
@Service
public class SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    public List<SysRole> getRoleListByUsername(String username){
        return  sysRoleMapper.getroleListByuser(username);
    }
}
