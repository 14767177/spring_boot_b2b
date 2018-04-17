package com.casic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LRN on 2017/12/25.
 *  拒绝访问页面
 */

@Service
public class CasicAccessDeniedHandler implements AccessDeniedHandler {

    private String accessDeniedUrl = "/commons/403.jsp";


    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e)
            throws IOException, ServletException {
        httpServletRequest.setAttribute("ex", e);
        httpServletRequest.getRequestDispatcher(this.accessDeniedUrl).forward(httpServletRequest, httpServletResponse);
    }
}
