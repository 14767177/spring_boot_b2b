package com.casic.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.servlet.*;
import java.io.IOException;

/**
 * Created by LRN on 2018/1/19.
 * security 自定义filter
 */

@Component
public class MyPermissionFilter extends AbstractSecurityInterceptor implements Filter {

    @Autowired
    private CasicDecisionManager casicDecisionManager;

    @Autowired
    private CasicSecurityMetadataSource casicSecurityMetadataSource;

    @Autowired
    private  AuthenticationManager authenticationManager;

    @PostConstruct
    public void init(){
        super.setAuthenticationManager(authenticationManager);
        super.setAccessDecisionManager(casicDecisionManager);
    }

    private FilterInvocationSecurityMetadataSource securityMetadataSource;

    public FilterInvocationSecurityMetadataSource getSecurityMetadataSource() {
        return securityMetadataSource;
    }

    public void setSecurityMetadataSource(FilterInvocationSecurityMetadataSource securityMetadataSource) {
        this.securityMetadataSource = securityMetadataSource;
    }

   /*public MyPermissionFilter( AccessDecisionManager accessDecisionManager,
                              FilterInvocationSecurityMetadataSource filterInvocationSecurityMetadataSource){
        setAccessDecisionManager(accessDecisionManager);
        setSecurityMetadataSource(filterInvocationSecurityMetadataSource);
    }*/
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        FilterInvocation fi = new FilterInvocation(request, response, chain);
        invoke(fi);
    }

    public void invoke(FilterInvocation fi) throws IOException, ServletException {

        InterceptorStatusToken token = super.beforeInvocation(fi);
        try {
            fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
        } finally {
            super.afterInvocation(token, null);
        }
    }

    @Override
    public void destroy() {

    }

    @Override
    public Class<?> getSecureObjectClass() {
        return FilterInvocation.class;
    }

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource() {
        return this.casicSecurityMetadataSource;
    }
}
