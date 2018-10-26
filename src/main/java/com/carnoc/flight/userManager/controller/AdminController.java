package com.carnoc.flight.userManager.controller;

import com.carnoc.flight.userManager.pojo.Admin;
import com.carnoc.flight.userManager.shiro.MyRealm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: AdminController
 * @Description: TODO 用户表处理类
 * @Author: Administrator
 * @CreateDate: 2018/10/26 20:11
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/26 20:11
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
public class AdminController {
    private static Logger logger= LogManager.getLogger(MyRealm.class);
    @RequestMapping("/login")
    public String login(Admin admin){
        System.out.println(admin);
        // users.setPassword(CryptoUtils.encodeSHA(users.getPassword()));
        System.out.println(admin.getPassword());
        //获得当前的Subject,调用SecurityUtils.getSubject()
        Subject subject = SecurityUtils.getSubject();
        //把用户名和密码封装为UsernamePasswordToken对象
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(admin.getUsername(),admin.getPassword());
        try {
            //执行认证操作.
            subject.login(usernamePasswordToken);
        }
        catch (UnknownAccountException ua){
            logger.info("没有指定的账户："+ua.getMessage());
            return "login.jsp";
        }
        catch (IncorrectCredentialsException ic){
            logger.info("密码不匹配 ："+ic.getMessage());
            return "login.jsp";
        }
        catch (LockedAccountException la){
            logger.info("用户被锁定  ："+la.getMessage());
            return "login.jsp";
        }
        catch (AuthenticationException ae){
            logger.info("登录失败："+ae.getMessage());
            return "login.jsp";
        }
//        // 执行登出，调用Subject的Logout()方法
//        subject.logout();
//
//        //安全退出
//        System.exit(0);

        return "index.jsp";
    }
}
