package com.carnoc.flight.userManager.service;

import com.carnoc.flight.userManager.pojo.Menu;

import java.util.List;

/**
 * @ClassName: MenuDao
 * @Description: TODO 权限目录表f_menu实体类接口
 * @Author: Administrator
 * @CreateDate: 2018/10/27 16:31
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/27 16:31
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface MenuService {
    /**
     * @Author Administrator
     * @Description //TODO 根据用户名查询该用户对应的权限
     * @Date 16:32 2018/10/27
     * @Param [username]
     * @return java.util.List<com.carnoc.flight.userManager.pojo.Menu>
     * @exception
     */
    public List<Menu> selectMenuByAdminUsername(String username);

    /**
     * @Author Administrator
     * @Description //TODO 根据权限父id查询该父id下所有的权限
     * @Date 19:46 2018/10/28
     * @Param [menuFid]
     * @return java.util.List<com.carnoc.flight.userManager.pojo.Menu>
     * @exception
     */
    public List<Menu> selectMenuByMenuFId(int menuFid);
    
    /**
     * @Author Administrator
     * @Description //TODO Administrator
     * @Date 19:53 2018/10/28
     * @Param [menuFid]
     * @return java.lang.StringBuffer
     * @exception
     */
    public List<String> getNodesMenu(int menuFid);
}
