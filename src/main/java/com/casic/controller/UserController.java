package com.casic.controller;

import com.casic.mapper.SysResMapper;
import com.casic.mapper.SysUserMapper;
import com.casic.model.SysOrg;
import com.casic.model.SysRes;
import com.casic.model.SysRole;
import com.casic.model.SysUser;
import com.casic.observer.ServerManager;
import com.casic.service.SysOrgService;
import com.casic.service.SysRoleService;
import com.casic.service.SysUserSercvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LRN on 2017/12/18.
 */
@Controller
public class UserController {



    @Autowired
    private SysUserSercvice sysUserSercvice;

    @Autowired
    private SysRoleService sysRoleService;

    @Autowired
    private SysResMapper sysResMapper;

    @Autowired
    private ServerManager serverManager;

    @Autowired
    private SysOrgService sysOrgService;

    @RequestMapping("/getuserinfo")
    @ResponseBody
    public  String getUserInfo(){

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication() .getPrincipal();
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        for (GrantedAuthority authority : authorities) {
            String authority1 = authority.getAuthority();
            System.out.println("当前用户角色" + authority1);
        }
        List<SysRes> urlAndRoleByAll = sysResMapper.getUrlAndRoleByAll();
        for (SysRes sysRes : urlAndRoleByAll) {
            System.out.println("sysRes-----------"+sysRes.getDefaulturl()+"-------role="+sysRes.getRole());
        }
        // SysUser sysUser = sysUserSercvice.getSysUserById(15L);
        SysUser sysUser = sysUserSercvice.getSysUserByUsername("admin");
        return sysUser.getFullname()+"    "+sysUser.getAccount()+"hahaha";
    }
    @RequestMapping("/getusers")
    @ResponseBody
    public  String getUsers(){

        return "what fuck do you  wantssssssssssss";
    }

    //@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    @RequestMapping("/saveuser")
    @ResponseBody
    public  String saveUsers(){
        SysUser sysuser = new SysUser();
        sysuser.setUserid(1001L);
        sysuser.setAccount("麻花藤");
        sysuser.setPassword("123456");
        sysuser.setEmail("14767177@163.com");
        sysuser.setFullname("马化腾");
        sysUserSercvice.saveUser(sysuser);
        return "OK";
    }

    @RequestMapping("/indexjsp")
    public ModelAndView loginByJsp(){
        ModelAndView mv = new ModelAndView("login.jsp");
        List<SysRole> roleList = sysRoleService.getRoleListByUsername("admin");
        return mv;
    }


    @RequestMapping("/getuserlist")
    public ModelAndView getuserlist(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("/view/userlist.jsp");
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        mv.addObject("user",userDetails);
        return mv;
    }

    @RequestMapping("/getobtest")
    public String getObtest(HttpServletRequest request, HttpServletResponse response){
        serverManager.setData(20);


        Map<SysUser,Object> map = new HashMap<>();
        SysUser s1 = new SysUser();
        SysUser s2 = new SysUser();
        map.put(s1,10);
        map.put(s2,20);
        map.put(s1,30);


        return null;
    }

    public static void main(String[] args) {
        Map<SysUser,Object> map = new HashMap<>();
        SysUser s1 = new SysUser();
        SysUser s2 = new SysUser();
        map.put(s1,10);
        map.put(s2,20);
        s1.setFullname("11111");
        map.put(s1,30);
        Object o1 = map.get(s1);
        Object o2 = map.get(s2);
        System.out.println(o1);
        System.out.println(o2);


    }

    @RequestMapping("/web/getuserbyaccount")
    @ResponseBody
    public  Map<String,Object> getUserByaccount(HttpServletRequest request, HttpServletResponse response){

        Map<String, Object> orgByorgid = sysOrgService.getOrgByorgid(100L);

        return  orgByorgid;
    }



}
