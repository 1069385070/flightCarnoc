package com.carnoc.flight.userManager.controller;

import com.carnoc.flight.userManager.pojo.Menu;
import com.carnoc.flight.userManager.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MenuController
 * @Description: TODO
 * @Author: Administrator
 * @CreateDate: 2018/10/28 21:17
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/28 21:17
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
public class MenuController {
    @Resource
    private MenuService menuService;
    @RequestMapping("/test")
    @ResponseBody
    public List<String> test(){
        List<String> stringList = menuService.getNodesMenu(0);
        System.out.println(stringList);
        return stringList;
    }
    @RequestMapping("/selectAllMenu")
    @ResponseBody
    public List<Object> selectAllMenu(){
        List<Object> la=new ArrayList<>();
        List<Menu> l1=new ArrayList<>();
        List<Menu> l2=new ArrayList<>();
        List<Menu> l3=new ArrayList<>();
        List<Menu> menuList = menuService.selectMenuByMenuFId(0);
        for(Menu menu:menuList){
            if(menu.getFid()==0){
                l1.add(menu);
            }
            if(menu.getFid()!=0&&menu.getUrl()==null){
                l2.add(menu);
            }
        }
        la.add(menuList);
        la.add(l1);
        la.add(l2);
        return la;
    }
}
