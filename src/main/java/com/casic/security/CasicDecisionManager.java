package com.casic.security;

import com.casic.model.SysUser;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import scala.concurrent.FutureTaskRunner;

import java.util.Collection;

/**
 * Created by LRN on 2018/1/20.
 */
@Service
public class CasicDecisionManager implements AccessDecisionManager {

    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {

        SysUser sysUser = (SysUser)authentication.getPrincipal();

        Collection<? extends GrantedAuthority> authorities = sysUser.getAuthorities();
        for (GrantedAuthority authority : authorities) {
            for (ConfigAttribute configAttribute : collection) {
                if(authority.getAuthority().equals(configAttribute.getAttribute())){
                    System.out.println("---------具有这个权限");
                    return;
                }
            }
        }
        throw  new AccessDeniedException("用户没有权限");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
