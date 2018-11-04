package com.carnoc.flight.userManager.dao;

import com.carnoc.flight.userManager.pojo.Admin;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
@Service
public interface AdminDao {
    /**
     * @Author Administrator
     * @Description //TODO 根据用户名查询用户信息
     * @Date 19:49 2018/10/26
     * @Param [username]
     * @return com.carnoc.flight.userManager.pojo.Admin
     * @exception
     */
    public Admin selectAdminByUsername(String username);
    
    /**
     * @Author Administrator
     * @Description //TODO 查询所有的用户
     * @Date 21:17 2018/10/27
     * @Param [admin]
     * @return java.util.List<java.util.Map < java.lang.String , java.lang.Object>>
     * @exception
     */ 
    public List<Map<String,Object>> selectAllAdmin(Admin admin);
    
    /**
     * @Author Administrator
     * @Description //TODO 添加一个用户
     * @Date 14:44 2018/10/28
     * @Param [admin]
     * @return int
     * @exception
     */
    public int addAdmin(Admin admin);
    /**
     * @Author Administrator
     * @Description //TODO 根据用户id查询用户信息
     * @Date 15:15 2018/10/29
     * @Param [adminId]
     * @return com.carnoc.flight.userManager.pojo.Admin
     * @exception
     */
    public Admin selectAdminById(int adminId);

    /**
     * @Author Administrator
     * @Description //TODO 根据条件修改用户信息
     * @Date 16:39 2018/10/29
     * @Param [admin]
     * @return int
     * @exception
     */
    public int updateAdmin(Admin admin);
    
    /**
     * @Author Administrator
     * @Description //TODO 根据条件查询查询某个用户组下的用户
     * @Date 21:48 2018/10/29
     * @Param [admin]
     * @return java.util.List<java.util.Map < java.lang.String , java.lang.Object>>
     * @exception
     */
    public List<Map<String,Object>> selectAdminByAdminRole(Admin admin);

    /**
     * @Author Administrator
     * @Description //TODO 根据用户名修改密码
     * @Date 14:36 2018/11/4
     * @Param [admin]
     * @return int
     * @exception
     */
    public int updatePasswordByUsername(Admin admin);

}
