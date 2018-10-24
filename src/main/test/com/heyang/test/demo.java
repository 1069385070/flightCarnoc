package com.heyang.test;

import com.heyang.ssm.pojo.User;
import com.heyang.ssm.service.UserService;
import com.heyang.ssm.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import sun.applet.Main;

import javax.annotation.Resource;
import java.util.Set;

public class demo {

    public static void main(String[] args) {
//        JedisPool jedisPool = new JedisPool("192.168.232.128",6379);
//        Jedis jedis = jedisPool.getResource();
//        String ping = jedis.ping();
//        System.out.println(ping);
//
//        Set<String> keys = jedis.keys("*");
//        for (String key : keys) {
//            System.out.println(key);
//        }
//        String s = jedis.get("com.heyang.ssm.dao.UserDao.getAllUser");
//        System.out.println(s);

//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[] {"spring.xml"});
//        SqlSessionFactory sqlSessionFactory = applicationContext.getBean("sqlSessionFactory");
//        UserService userService = new UserServiceImpl();
//        System.out.println(System.currentTimeMillis());
//        for (int i=1;i<1000000;i++){
//            User user = new User();
//            user.setUserName("T202hahaha"+i);
//            user.setUserPassword(""+i);
//            userService.addUser(user);
//        }
        System.out.println(System.currentTimeMillis());
        System.out.println("哈哈哈哈哈");

    }
}
