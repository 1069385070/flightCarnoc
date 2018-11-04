package com.carnoc.flight.userManager.service.impl;

import com.carnoc.flight.userManager.dao.AdminDao;
import com.carnoc.flight.userManager.pojo.Admin;
import com.carnoc.flight.userManager.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: AdminServiceImpl
 * @Description: TODO  用户表f_admin实体类接口实现类
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

    /**
     * @Author Administrator
     * @Description //TODO 查询所有的用户
     * @Date 21:16 2018/10/27
     * @Param [admin]
     * @return java.util.List<java.util.Map < java.lang.String , java.lang.Object>>
     * @exception
     */
    @Override
    public List<Map<String, Object>> selectAllAdmin(Admin admin) {
        return adminDao.selectAllAdmin(admin);
    }
    
    /**
     * @Author Administrator
     * @Description //TODO 添加一个用户
     * @Date 15:23 2018/10/28
     * @Param [admin]
     * @return int
     * @exception
     */
    @Override
    public int addAdmin(Admin admin) {
        return adminDao.addAdmin(admin);
    }
    
    /**
     * @Author Administrator
     * @Description //TODO 根据用户id查询用户信息
     * @Date 15:26 2018/10/29
     * @Param [adminId]
     * @return com.carnoc.flight.userManager.pojo.Admin
     * @exception
     */
    @Override
    public Admin selectAdminById(int adminId) {
        return adminDao.selectAdminById(adminId);
    }

    /**
     * @Author Administrator
     * @Description //TODO 根据条件修改用户信息
     * @Date 16:39 2018/10/29
     * @Param [admin]
     * @return int
     * @exception
     */
    @Override
    public int updateAdmin(Admin admin) {
        return adminDao.updateAdmin(admin);
    }

    /**
     * @Author Administrator
     * @Description //TODO 根据条件查询查询某个用户组下的用户
     * @Date 22:01 2018/10/29
     * @Param [admin]
     * @return java.util.List<java.util.Map < java.lang.String , java.lang.Object>>
     * @exception
     */
    @Override
    public List<Map<String, Object>> selectAdminByAdminRole(Admin admin) {
        return adminDao.selectAdminByAdminRole(admin);
    }

    /**
     * @Author Administrator
     * @Description //TODO 根据用户名修改密码
     * @Date 14:37 2018/11/4
     * @Param [admin]
     * @return int
     * @exception
     */
    @Override
    public int updatePasswordByUsername(Admin admin) {
        return adminDao.updatePasswordByUsername(admin);
    }
}
