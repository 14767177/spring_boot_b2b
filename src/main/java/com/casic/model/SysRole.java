package com.casic.model;

public class SysRole {
    private Long roleid;

    private Long systemid;

    private String alias;

    private String rolename;

    private String memo;

    private Short allowdel;

    private Short allowedit;

    private Short enabled;

    private String roletype;

    private Integer istenant;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getSystemid() {
        return systemid;
    }

    public void setSystemid(Long systemid) {
        this.systemid = systemid;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Short getAllowdel() {
        return allowdel;
    }

    public void setAllowdel(Short allowdel) {
        this.allowdel = allowdel;
    }

    public Short getAllowedit() {
        return allowedit;
    }

    public void setAllowedit(Short allowedit) {
        this.allowedit = allowedit;
    }

    public Short getEnabled() {
        return enabled;
    }

    public void setEnabled(Short enabled) {
        this.enabled = enabled;
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype == null ? null : roletype.trim();
    }

    public Integer getIstenant() {
        return istenant;
    }

    public void setIstenant(Integer istenant) {
        this.istenant = istenant;
    }
}