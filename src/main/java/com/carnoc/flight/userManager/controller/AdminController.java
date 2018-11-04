package com.carnoc.flight.userManager.controller;

import com.alibaba.fastjson.JSONArray;
import com.carnoc.flight.userManager.pojo.Admin;
import com.carnoc.flight.userManager.service.AdminService;
import com.carnoc.flight.userManager.shiro.MyRealm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: AdminController
 * @Description: TODO
 * @Author: Administrator
 * @CreateDate: 2018/10/27 18:14
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/27 18:14
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
public class AdminController {
    @Resource
    private AdminService adminService;

    /**
     * @Author Administrator
     * @Description //TODO 根据条件查询用户
     * @Date 15:28 2018/10/29
     * @Param [admin]
     * @return java.util.List<java.util.Map < java.lang.String , java.lang.Object>>
     * @exception
     */
    @RequestMapping("/selectAllAdmin")
    @ResponseBody
    public List<Object> selectAllAdmin(Admin admin,Integer page,Integer rows){
        System.out.println(admin);
        List<Object> list=new ArrayList<>();
        List<Map<String,Object>> la=new ArrayList<>();
        if(page!=null&&rows!=null){
            int start=(page-1)*rows;
            int end=start+rows;
            List<Map<String,Object>> adminList = adminService.selectAllAdmin(admin);
            for (int i = 0; i <adminList.size() ; i++) {
                if(i>=start&&i<end){
                    la.add(adminList.get(i));
                }
            }
            list.add(la);
            list.add(adminList.size());
        }else{
            list.add(la);
        }
        return list;
    }
    
    /**
     * @Author Administrator
     * @Description //TODO 添加一个用户
     * @Date 15:28 2018/10/29
     * @Param [admin]
     * @return java.lang.String
     * @exception
     */
    @RequestMapping("/addAdmin")
    @ResponseBody
    public String addAdmin(Admin admin){
        Date d = new Date();
        System.out.println(admin);
        admin.setPassword(MyRealm.md5(admin.getPassword()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date=sdf.format(d);
        admin.setAddTime(date);
        admin.setEmail(admin.getQq()+"@qq.com");
        admin.setState(1);
        System.out.println(admin);
        int i = adminService.addAdmin(admin);
        System.out.println(i);
        System.out.println("还有");
        return i+"";
    }
    /**
     * @Author Administrator
     * @Description //TODO 根据用户id查询用户信息
     * @Date 15:43 2018/10/29
     * @Param [adminId]
     * @return com.carnoc.flight.userManager.pojo.Admin
     * @exception
     */
    @RequestMapping("/selectAdminById")
    @ResponseBody
    public Admin selectAdminById(int adminId){
        Admin admin = adminService.selectAdminById(adminId);
        return admin;
    }
    /**
     * @Author Administrator
     * @Description //TODO 根据条件修改用户信息
     * @Date 20:02 2018/10/30
     * @Param [admin]
     * @return java.lang.String
     * @exception
     */
    @RequestMapping("/updateAdmin")
    @ResponseBody
    public String updateAdmin(Admin admin){
        System.out.println(admin);
        int i = adminService.updateAdmin(admin);
        System.out.println(i);
        System.out.println("还有");
        return i+"";
    }
    /**
     * @Author Administrator
     * @Description //TODO  根据条件查询查询某个用户组下的用户
     * @Date 20:01 2018/10/30
     * @Param [admin]
     * @return java.util.List<java.util.Map < java.lang.String , java.lang.Object>>
     * @exception
     */
    @RequestMapping("/selectAdminByAdminRole")
    @ResponseBody
    public List<Map<String,Object>> selectAdminByAdminRole(Admin admin){
        List<Map<String, Object>> mapList = adminService.selectAllAdmin(admin);
        return mapList;
    }
    
    /**
     * @Author Administrator
     * @Description //TODO 判断用户名是否存在或者密码是否正确
     * @Date 9:07 2018/11/2
     * @Param [admin]
     * @return java.lang.String
     * @exception
     */
    @RequestMapping("/judgeUsernameExit")
    @ResponseBody
    public String judgeUsernameExit(Admin admin){
        System.out.println(admin.getUsername()+"进来了");
        if(admin.getPassword()!=null){
            admin.setPassword(MyRealm.md5(admin.getPassword()));
            System.out.println(admin.getPassword());
        }
        int i=0;
        Admin admin1 = adminService.selectAdminByUsername(admin.getUsername());
        System.out.println(admin.getPassword().equals(admin1.getPassword()));
        if(admin1!=null){
            i=-1;
            if(!admin.getPassword().equals(admin1.getPassword())){
                i=1;
            }
        }
        return i+"";
    }
    /**
     * @Author Administrator
     * @Description //TODO 修改密码
     * @Date 14:27 2018/11/4
     * @Param [admin]
     * @return java.lang.String
     * @exception
     */
    @RequestMapping("/updatePassword")
    public String updatePassword(Admin admin){
        admin.setPassword(MyRealm.md5(admin.getPassword()));
        int i = adminService.updatePasswordByUsername(admin);
        System.out.println(admin);
        return "redirect:/logout";
    }

}
