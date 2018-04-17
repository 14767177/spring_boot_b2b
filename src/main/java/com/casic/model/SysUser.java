package com.casic.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class SysUser implements UserDetails ,Serializable {

    public SysUser(){}


    public SysUser(List<SysRole> listRole, String account, String password,Short isexpired,Short islock) {
        this.listRole = listRole;
        this.account = account;
        this.password = password;
        this.isexpired = isexpired;
        this.islock =islock;
    }

    /**
     *
     */
    private static final long serialVersionUID = -6498309642739707784L;

    public List<SysRole> getListRole() {
        return listRole;
    }

    public void setListRole(List<SysRole> listRole) {
        this.listRole = listRole;
    }

    private List<SysRole> listRole ;

    private Long userid;

    private String fullname;

    private String account;

    private String password;

    private Short isexpired;

    private Short islock;

    private Date createtime;

    private Short status;

    private String email;

    private String mobile;

    private String phone;

    private String sex;

    private String picture;

    private Short fromtype;

    private Long orgid;

    private Long orgsn;

    private String shortaccount;

    private String orgtype;

    private Long typeid;

    private String typename;

    private String code;

    private String refcode;

    private Integer securityLevel;

    private Integer isapply;

    private Long openid;

    private Long score;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }




    //权限集合
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> auths = new ArrayList<>();
        List<SysRole> roleList = this.getListRole();
        for (SysRole sysRole : roleList) {
            GrantedAuthority grantedAuthority  = new SimpleGrantedAuthority( sysRole.getAlias().trim());
            auths.add(grantedAuthority);
        }
        return auths;
    }


    //用户密码
    public String getPassword() {
        return password;
    }
    //用户名
    @Override
    public String getUsername() {
        return this.account;
    }
    //账号是否过期
    @Override
    public boolean isAccountNonExpired() {
        if(this.isexpired==0){
        return true;
        }
        return false;
    }
    //账号是否锁定
    @Override
    public boolean isAccountNonLocked() {
        if(this.islock==0){
            return  true;
        }
        return false;
    }
    //证书是否过期
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    //账户是否有效
    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Short getIsexpired() {
        return isexpired;
    }

    public void setIsexpired(Short isexpired) {
        this.isexpired = isexpired;
    }

    public Short getIslock() {
        return islock;
    }

    public void setIslock(Short islock) {
        this.islock = islock;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Short getFromtype() {
        return fromtype;
    }

    public void setFromtype(Short fromtype) {
        this.fromtype = fromtype;
    }

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public Long getOrgsn() {
        return orgsn;
    }

    public void setOrgsn(Long orgsn) {
        this.orgsn = orgsn;
    }

    public String getShortaccount() {
        return shortaccount;
    }

    public void setShortaccount(String shortaccount) {
        this.shortaccount = shortaccount == null ? null : shortaccount.trim();
    }

    public String getOrgtype() {
        return orgtype;
    }

    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype == null ? null : orgtype.trim();
    }

    public Long getTypeid() {
        return typeid;
    }

    public void setTypeid(Long typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getRefcode() {
        return refcode;
    }

    public void setRefcode(String refcode) {
        this.refcode = refcode == null ? null : refcode.trim();
    }

    public Integer getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
    }

    public Integer getIsapply() {
        return isapply;
    }

    public void setIsapply(Integer isapply) {
        this.isapply = isapply;
    }

    public Long getOpenid() {
        return openid;
    }

    public void setOpenid(Long openid) {
        this.openid = openid;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }





}