package com.carnoc.flight.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.util.Date;

public class demo {
    private static Logger logger = LogManager.getLogger(demo.class);
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

//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[] {"spring-core.xml"});
//        SqlSessionFactory sqlSessionFactory = applicationContext.getBean("sqlSessionFactory");
//        UserService userService = new UserServiceImpl();
//        System.out.println(System.currentTimeMillis());
//        for (int i=1;i<1000000;i++){
//            User userManager = new User();
//            userManager.setUserName("T202hahaha"+i);
//            userManager.setUserPassword(""+i);
//            userService.addUser(userManager);
//        }
    /*    System.out.println(System.currentTimeMillis());
        System.out.println("哈哈哈哈哈");
        System.out.println("jahahahah");
        System.out.println("不更新");

        System.out.println("提交");
        System.out.println("李鹏飞修改了");
        logger.info("何洋log");
        logger.info("李鹏飞log");
        System.out.println(123123132);*/

        System.out.println("12313123132123132");
        Date date = getNextDate();
        System.out.println(date);

    }


    public static Date getNextDate(){

       /* try{
            Thread.sleep(24*60*60*1000);
        }catch (Exception e){
            e.printStackTrace();
        }*/
        return new Date();
    }



}
