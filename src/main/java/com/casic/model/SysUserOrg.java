package com.casic.model;

public class SysUserOrg {
    private Long userorgid;

    private Long orgid;

    private Long userid;

    private Short isprimary;

    private Long ischarge;

    private Short isgrademanage;

    public Long getUserorgid() {
        return userorgid;
    }

    public void setUserorgid(Long userorgid) {
        this.userorgid = userorgid;
    }

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Short getIsprimary() {
        return isprimary;
    }

    public void setIsprimary(Short isprimary) {
        this.isprimary = isprimary;
    }

    public Long getIscharge() {
        return ischarge;
    }

    public void setIscharge(Long ischarge) {
        this.ischarge = ischarge;
    }

    public Short getIsgrademanage() {
        return isgrademanage;
    }

    public void setIsgrademanage(Short isgrademanage) {
        this.isgrademanage = isgrademanage;
    }
}