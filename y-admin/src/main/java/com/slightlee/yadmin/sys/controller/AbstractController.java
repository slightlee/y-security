package com.slightlee.yadmin.sys.controller;

import com.slightlee.yadmin.sys.pojo.SysUser;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class AbstractController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected SysUser getUser() {
        return (SysUser) SecurityUtils.getSubject().getPrincipal();
    }

    protected Long getUserId() {
        return getUser().getUserId();
    }

//    protected Long getDeptId() {
//        return getUser().getDeptId();
//    }
}
