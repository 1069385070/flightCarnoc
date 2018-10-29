package com.carnoc.flight.userManager.controller;

import com.alibaba.fastjson.JSONArray;
import com.carnoc.flight.userManager.pojo.Admin;
import com.carnoc.flight.userManager.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
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
    @RequestMapping("/selectAllAdmin")
    @ResponseBody
    public List<Map<String,Object>> selectAllAdmin(Admin admin){
        System.out.println(admin);
        List<Map<String,Object>> adminList = adminService.selectAllAdmin(admin);
//        String toJSONString = JSONArray.toJSONString(adminList);
//        out.write(toJSONString);
        return adminList;
    }
    @RequestMapping("/addAdmin")
    @ResponseBody
    public String addAdmin(Admin admin){
        Date d = new Date();
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
}
