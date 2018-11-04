package com.carnoc.flight.userManager.controller;

import com.alibaba.fastjson.JSON;
import com.carnoc.flight.redis.RedisCache;
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
    @Resource
    private RedisCache redisCache;

    @RequestMapping("/test")
    @ResponseBody
    public List<String> test(){
        List<String> stringList = menuService.getNodesMenu(0);
        System.out.println(stringList);
        return stringList;
    }
    /**
     * @Author Administrator
     * @Description //TODO 查询所有的权限
     * @Date 17:59 2018/11/1
     * @Param []
     * @return java.util.List<java.lang.Object>
     * @exception
     */
    @RequestMapping("/selectAllMenu")
    @ResponseBody
    public List<Object> selectAllMenu(){
        List<Object> la=new ArrayList<>();
        List<Menu> l1=new ArrayList<>();
        List<Menu> l2=new ArrayList<>();
        List<Menu> l3=new ArrayList<>();
        List<Menu> menuList =null;
        //先从redis中获取
//        String key="com.carnoc.flight.userManager.dao.MenuDao.selectMenuByMenuFId.menuFid";
//        String data = redisCache.getDataFromRedis(key);
//        if(data==null){
//            //没有就查询数据库
//            menuList=menuService.selectMenuByMenuFId(0);
//            //先把集合对象转换成json
//            String string = JSON.toJSONString(menuList);
//            //把查询的结果放入到redis中
//            redisCache.setDataToRedis(key,string);
//        }else{
//            //将data转换成对象集合
//            menuList=JSON.parseArray(data,Menu.class);
//        }
        menuList=menuService.selectMenuByMenuFId(0);
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
