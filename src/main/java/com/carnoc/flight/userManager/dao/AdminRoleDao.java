package com.carnoc.flight.userManager.dao;

import com.carnoc.flight.userManager.pojo.AdminRole;

import java.util.List;

/**
 * @ClassName: AdminRoleDao
 * @Description: TODO 用户组表f_admin_role实体类接口
 * @Author: Administrator
 * @CreateDate: 2018/10/27 15:45
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/27 15:45
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface AdminRoleDao {
    /**
     * @Author Administrator
     * @Description //TODO 查询所有的用户组
     * @Date 12:57 2018/10/28
     * @Param [adminRole]
     * @return java.util.List<com.carnoc.flight.userManager.pojo.AdminRole>
     * @exception
     */
   public List<AdminRole> selectAllAdminRole(AdminRole adminRole);
   
   /**
    * @Author Administrator
    * @Description //TODO 添加一个用户组
    * @Date 17:41 2018/10/28
    * @Param [adminRole]
    * @return int
    * @exception
    */
   public int addAdminRole(AdminRole adminRole);
    
   /**
    * @Author Administrator
    * @Description //TODO 根据条件修改用户组信息
    * @Date 20:26 2018/10/29
    * @Param [adminRole]
    * @return int
    * @exception
    */
   public int updateAdminRole(AdminRole adminRole);
}
