package com.casic.security;

import com.casic.model.SysRole;
import com.casic.model.SysUser;
import com.casic.service.SysRoleService;
import com.casic.service.SysUserSercvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by LRN on 2017/12/20.
 */
@Service
public class UserValidateService implements UserDetailsService {

    @Autowired
    private SysUserSercvice sysUserSercvice;
    @Autowired
    private SysRoleService sysRoleService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        SysUser sysUser = sysUserSercvice.getSysUserByUsername(username);
        if(sysUser==null){
            throw new  UsernameNotFoundException("username"+username+"not found");
        }
        List<SysRole> roleList = sysRoleService.getRoleListByUsername(username);

        SysUser userDetails = new SysUser(roleList,sysUser.getAccount(),sysUser.getPassword(),sysUser.getIsexpired(), sysUser.getIslock());

        return userDetails;
    }
}
