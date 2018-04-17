package com.casic.security;

import com.casic.controller.ValidCode;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.ForwardAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LRN on 2018/1/10.
 * 集成 认证过滤器 或者UsernamePasswordAuthenticationFilter
 */
public class ApiUsernamePasswordAuthenticationFilter extends AbstractAuthenticationProcessingFilter{


    public ApiUsernamePasswordAuthenticationFilter(AuthenticationManager authenticationManager,ForwardAuthenticationSuccessHandler forwardAuthenticationSuccessHandler
    ,SimpleUrlAuthenticationFailureHandler simpleUrlAuthenticationFailureHandler) {
        super(new AntPathRequestMatcher("/login", "POST"));
        setAuthenticationManager(authenticationManager);
        setAuthenticationSuccessHandler(forwardAuthenticationSuccessHandler);
        setAuthenticationFailureHandler(simpleUrlAuthenticationFailureHandler);

    }
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        String verifyCode = (String) request.getParameter("verifyCode");
        String username = (String)request.getParameter("username");
        String password = (String)request.getParameter("password");
        try {
           String validCode = (String) request.getSession().getAttribute(ValidCode.SessionName_Randcode);
           if (validCode == null || StringUtils.isEmpty(verifyCode) || !validCode.equalsIgnoreCase(verifyCode)) {
               request.getSession().setAttribute(WebAttributes.AUTHENTICATION_EXCEPTION, "验证码不正确！");
               throw new SessionAuthenticationException("验证码错误");
           }
       }catch (Exception e){
           e.printStackTrace();
           throw new SessionAuthenticationException("验证码错误");
       }
        username = username.trim();
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);
        authRequest.setDetails(this.authenticationDetailsSource.buildDetails(request));
        return this.getAuthenticationManager().authenticate(authRequest);
    }
}
