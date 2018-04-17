package com.casic.security;

import com.casic.mapper.SysResMapper;
import com.casic.mapper.SysRoleMapper;
import com.casic.model.SysRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by LRN on 2018/1/20.
 */
@Service
public class CasicSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    @Autowired
    private SysResMapper sysResMapper;

    @Autowired
    private SysRoleMapper sysRoleMapper;

    //url与角色的关系
    private static Map<String, Collection<ConfigAttribute>> resourceMap = new HashMap<>();

    /**
     * 在Web服务器启动时，提取系统中的所有权限
     */
    @PostConstruct
    public void loadResourceDefine(){
        List<SysRes> urlAndRoleByAll = sysResMapper.getUrlAndRoleByAll();
        for (SysRes sysRes : urlAndRoleByAll) {
            Collection<ConfigAttribute> configAttributes = resourceMap.get(sysRes.getDefaulturl());
            if(configAttributes == null){
                List<ConfigAttribute> list = new ArrayList<>();
                list.add(new SecurityConfig(sysRes.getRole().trim()));
                resourceMap.put(sysRes.getDefaulturl(),list);
            }else{
                configAttributes.add(new SecurityConfig(sysRes.getRole().trim()));
                resourceMap.put(sysRes.getDefaulturl(),configAttributes);
            }
        }
    }


    /**
     * 此方法是为了判定用户请求的url 是否在权限表中，
     * 如果在权限表中，则返回给 decide 方法，
     * 用来判定用户是否有此权限。如果不在权限表中则放行
     */

    @Override
    public Collection<ConfigAttribute> getAttributes(Object obj) throws IllegalArgumentException {

        FilterInvocation filterInvocation = (FilterInvocation) obj;
        HttpServletRequest request = filterInvocation.getRequest();
        String url = request.getRequestURI();
        url = removeCtx(url, request.getContextPath());

        AntPathMatcher matcher = new AntPathMatcher();
        Set<String> strings = resourceMap.keySet();
        for (String key : strings) {
            if(matcher.match(key, url)){
                return resourceMap.get(key);
            }

        }

        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

    private static String removeCtx(String url, String contextPath) {
        url = url.trim();
        if (StringUtils.isEmpty(contextPath))
            return url;
        if (StringUtils.isEmpty(url))
            return "";
        if (url.startsWith(contextPath)) {
            url = url.replaceFirst(contextPath, "");
        }
        return url;
    }
}
