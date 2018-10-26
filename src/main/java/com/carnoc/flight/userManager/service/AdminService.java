package com.carnoc.flight.userManager.service;

import com.carnoc.flight.userManager.pojo.Admin;

/**
 * @ClassName: AdminDao
 * @Description: TODO 用户表f_admin实体类接口
 * @Author: Administrator
 * @CreateDate: 2018/10/26 19:42
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/26 19:42
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface AdminService {
    /**
     * @Author Administrator
     * @Description //TODO 根据用户名查询用户信息
     * @Date 19:49 2018/10/26
     * @Param [username]
     * @return com.carnoc.flight.userManager.pojo.Admin
     * @exception
     */
    public Admin selectAdminByUsername(String username);
}
