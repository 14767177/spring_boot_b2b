package com.casic.model;

import java.util.List;

public class SysRes {
    private Long resid;

    private String resname;

    private String alias;

    private Integer sn;

    private String icon;

    private Long parentid;

    private String defaulturl;

    private Short isfolder;

    private Short isdisplayinmenu;

    private Short isopen;

    private Long systemid;

    private String path;

    private Integer ishidden;

    private List<SysRole> roleList;

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    public Long getResid() {
        return resid;
    }

    public void setResid(Long resid) {
        this.resid = resid;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname == null ? null : resname.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getDefaulturl() {
        return defaulturl;
    }

    public void setDefaulturl(String defaulturl) {
        this.defaulturl = defaulturl == null ? null : defaulturl.trim();
    }

    public Short getIsfolder() {
        return isfolder;
    }

    public void setIsfolder(Short isfolder) {
        this.isfolder = isfolder;
    }

    public Short getIsdisplayinmenu() {
        return isdisplayinmenu;
    }

    public void setIsdisplayinmenu(Short isdisplayinmenu) {
        this.isdisplayinmenu = isdisplayinmenu;
    }

    public Short getIsopen() {
        return isopen;
    }

    public void setIsopen(Short isopen) {
        this.isopen = isopen;
    }

    public Long getSystemid() {
        return systemid;
    }

    public void setSystemid(Long systemid) {
        this.systemid = systemid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getIshidden() {
        return ishidden;
    }

    public void setIshidden(Integer ishidden) {
        this.ishidden = ishidden;
    }
}