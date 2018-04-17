package com.casic.service;

import com.casic.mapper.SysOrgMapper;
import com.casic.model.SysOrg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by LRN on 2018/3/25.
 */
@Service
public class SysOrgService {

    @Autowired
    private SysOrgMapper sysOrgMapper;

    public Map<String,Object> getOrgByorgid(Long orgid){
        return sysOrgMapper.getOrgByorgid(orgid);
    }
}
