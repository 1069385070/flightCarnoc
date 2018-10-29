package com.carnoc.flight.userManager.controller;

import com.carnoc.flight.userManager.pojo.AdminRole;
import com.carnoc.flight.userManager.service.AdminRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
}
