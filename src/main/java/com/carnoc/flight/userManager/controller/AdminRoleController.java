package com.carnoc.flight.userManager.controller;

import com.carnoc.flight.userManager.pojo.Admin;
import com.carnoc.flight.userManager.pojo.AdminRole;
import com.carnoc.flight.userManager.service.AdminRoleService;
import com.carnoc.flight.userManager.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: AdminRoleController
 * @Description: TODO 用户组表f_admin_role处理类
 * @Author: Administrator
 * @CreateDate: 2018/10/28 13:04
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/28 13:04
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
public class AdminRoleController {
    @Resource
    private AdminRoleService adminRoleService;

    @Resource
    private AdminService adminService;
    /**
     * @Author Administrator
     * @Description //TODO 查询所有的用户组
     * @Date 17:51 2018/10/28
     * @Param [adminRole]
     * @return java.util.List<com.carnoc.flight.userManager.pojo.AdminRole>
     * @exception
     */
    @RequestMapping("/selectAllAdminRole")
    @ResponseBody
    public List<AdminRole> selectAllAdminRole(AdminRole adminRole){
        List<AdminRole> adminRoleList = adminRoleService.selectAllAdminRole(adminRole);
        return adminRoleList;
    }
    /**
     * @Author Administrator
     * @Description //TODO 添加一个用户
     * @Date 20:30 2018/10/29
     * @Param [adminRole]
     * @return java.lang.String
     * @exception
     */
    @RequestMapping("/addAdminRole")
    @ResponseBody
    public String addAdminRole(AdminRole adminRole){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date=sdf.format(d);
        adminRole.setRoleState(1);
        adminRole.setAddTime(date);
        int i = adminRoleService.addAdminRole(adminRole);
        return i+"";
    }
    /**
     * @Author Administrator
     * @Description //TODO 根据条件修改用户组信息
     * @Date 20:14 2018/10/30
     * @Param [adminRole]
     * @return java.lang.String
     * @exception
     */
    @RequestMapping("/updateAdminRole")
    @ResponseBody
    public String updateAdminRole(AdminRole adminRole){
        System.out.println(adminRole);
        int i =0;
        if(adminRole.getMenuId()!=null){
            i=adminRoleService.updateAdminRole(adminRole);
        }else{
            Admin admin = new Admin();
            admin.setRoleId(adminRole.getId());
            List<Map<String, Object>> mapList = adminService.selectAllAdmin(admin);
            if(mapList!=null&&mapList.size()!=0){
                i=-1;
            }else{
                i=adminRoleService.updateAdminRole(adminRole);
            }
        }
        System.out.println(i);
        return i+"";
    }
}
