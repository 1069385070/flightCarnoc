package com.carnoc.flight.userManager.service.impl;

import com.carnoc.flight.userManager.dao.AdminRoleDao;
import com.carnoc.flight.userManager.pojo.AdminRole;
import com.carnoc.flight.userManager.service.AdminRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: AdminRoleServiceImpl
 * @Description: TODO  用户组表f_admin_role实体类接口实现类
 * @Author: Administrator
 * @CreateDate: 2018/10/28 13:01
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/28 13:01
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service("adminRoleService")
public class AdminRoleServiceImpl implements AdminRoleService {
    @Resource
    private AdminRoleDao adminRoleDao;
    /**
     * @Author Administrator
     * @Description //TODO 查询所有的用户组
     * @Date 13:03 2018/10/28
     * @Param [adminRole]
     * @return java.util.List<com.carnoc.flight.userManager.pojo.AdminRole>
     * @exception
     */
    @Override
    public List<AdminRole> selectAllAdminRole(AdminRole adminRole) {
        return adminRoleDao.selectAllAdminRole(adminRole);
    }
    
    /**
     * @Author Administrator
     * @Description //TODO 添加一个用户组
     * @Date 17:44 2018/10/28
     * @Param [adminRole]
     * @return int
     * @exception
     */
    @Override
    public int addAdminRole(AdminRole adminRole) {
        return adminRoleDao.addAdminRole(adminRole);
    }
    
    /**
     * @Author Administrator
     * @Description //TODO 根据条件修改用户组信息
     * @Date 20:25 2018/10/29
     * @Param [adminRole]
     * @return int
     * @exception
     */
    @Override
    public int updateAdminRole(AdminRole adminRole) {
        return adminRoleDao.updateAdminRole(adminRole);
    }
}
