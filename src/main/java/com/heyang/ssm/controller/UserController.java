package com.heyang.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.heyang.ssm.pojo.User;
import com.heyang.ssm.redis.RedisCache;
import com.heyang.ssm.service.UserService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private RedisCache redisCache;


    @RequestMapping("/getAllUser")
    public String getAllUser(Model model){
        List<User> allUser = userService.getAllUser();
        System.out.println(allUser);
        model.addAttribute("user",allUser);
        return "index.jsp";
    }


    @RequestMapping("/addUser")
    public String addUser(User user){
        int i = userService.addUser(user);
        if(i>0){
            return "redirect:/redis.do";
        }
        return "redirect:error.jsp";
    }


    @RequestMapping("/getUserByID")
    public String getUserByID(Integer userId,Model model){

        User userById = userService.getUserById(userId);
        model.addAttribute("user",userById);
        return "userUpdateInfo.jsp";
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user){
        System.out.println(user);
        int i = userService.updateUser(user);
        if(i>0){
            return "redirect:success.jsp";
        }
        return "redirect:index.jsp";
    }


    @RequestMapping("/deleteUser")
    public String deleteUser(Integer userId){
        int i = userService.deleteUser(userId);
        if(i>0){
            return "redirect:success.jsp";
        }
        return "redirect:index.jsp";
    }


    @RequestMapping("/getUser")
    public String getUser(User user,Model model){
        List<User> user1 = userService.getUser(user);
        model.addAttribute("user",user1);
        return null;
    }



    @RequestMapping("/redis")
    public String redisCaches(Map map){
        List<User> li = null;

        //1.先从redis缓存中获取数据
        //1.1 先配置redis中的key
        String key="com.heyang.ssm.dao.UserDao.getAllUser";
        //key => 所调用dao方法所在接口的包名+类名+方法名。
        //key是唯一的


        //1.2 去redis缓存中按key获值
        String data=redisCache.getDataFromRedis(key);

        //1.3 判断从redis取出的值是否为null
        //为null表示redis中没有缓存该数据
        if(data==null){

            //2.无：查询数据库
            //调用dao方法，得到数据
            li = userService.getAllUser();
            //注意：redis中不能存放对象集合，必须要转换json
            //先把对象集合转成json（注意引入fastjson）
            String jsonString = JSON.toJSONString(li);
            //把查询到结果放入到redis中
            redisCache.setDataToRedis(key,jsonString);
        }else{
            li = JSON.parseArray(data,User.class);
        }
        map.put("user",li);
        return "index.jsp";
    }


    @RequestMapping("/addUsers")
    public String addUsers(User user){
        System.out.println(System.currentTimeMillis());
        for (int i=1;i<1000000;i++){
            user.setUserName("T202hahaha"+i);
            user.setUserPassword(""+i);
            userService.addUser(user);
        }
        System.out.println(System.currentTimeMillis());
        return "redirect:/redis.do";
    }
}
