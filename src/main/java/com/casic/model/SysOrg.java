package com.casic.model;

import java.util.Date;

public class SysOrg {
    private Long orgid;

    private Long demid;

    private String orgname;

    private String orgdesc;

    private Long orgsupid;

    private String path;

    private Integer depth;

    private Long orgtype;

    private Long creatorid;

    private Date createtime;

    private Long updateid;

    private Date updatetime;

    private Long sn;

    private Short fromtype;

    private Short orgstatus;

    private Short issystem;

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public Long getDemid() {
        return demid;
    }

    public void setDemid(Long demid) {
        this.demid = demid;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getOrgdesc() {
        return orgdesc;
    }

    public void setOrgdesc(String orgdesc) {
        this.orgdesc = orgdesc == null ? null : orgdesc.trim();
    }

    public Long getOrgsupid() {
        return orgsupid;
    }

    public void setOrgsupid(Long orgsupid) {
        this.orgsupid = orgsupid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Long getOrgtype() {
        return orgtype;
    }

    public void setOrgtype(Long orgtype) {
        this.orgtype = orgtype;
    }

    public Long getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Long creatorid) {
        this.creatorid = creatorid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getUpdateid() {
        return updateid;
    }

    public void setUpdateid(Long updateid) {
        this.updateid = updateid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Long getSn() {
        return sn;
    }

    public void setSn(Long sn) {
        this.sn = sn;
    }

    public Short getFromtype() {
        return fromtype;
    }

    public void setFromtype(Short fromtype) {
        this.fromtype = fromtype;
    }

    public Short getOrgstatus() {
        return orgstatus;
    }

    public void setOrgstatus(Short orgstatus) {
        this.orgstatus = orgstatus;
    }

    public Short getIssystem() {
        return issystem;
    }

    public void setIssystem(Short issystem) {
        this.issystem = issystem;
    }
}