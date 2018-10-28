package com.carnoc.flight.userManager.service.impl;

import com.carnoc.flight.userManager.dao.AdminDao;
import com.carnoc.flight.userManager.pojo.Admin;
import com.carnoc.flight.userManager.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: AdminServiceImpl
 * @Description: TODO
 * @Author: Administrator
 * @CreateDate: 2018/10/26 19:59
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/26 19:59
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;
    /**
     * @Author Administrator
     * @Description //TODO 根据用户名查询用户信息
     * @Date 19:59 2018/10/26
     * @Param [username]
     * @return com.carnoc.flight.userManager.pojo.Admin
     * @exception
     */
    @Override
    public Admin selectAdminByUsername(String username) {
        return adminDao.selectAdminByUsername(username);
    }
}
