package com.carnoc.flight.userManager.controller;

import com.carnoc.flight.userManager.pojo.Admin;
import com.carnoc.flight.userManager.pojo.Menu;
import com.carnoc.flight.userManager.service.MenuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

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
public class LoginController {
    private static Logger logger= LogManager.getLogger(LoginController.class);
    @Resource
    private MenuService menuService;
    /**
     * @Author Administrator
     * @Description //TODO Administrator
     * @Date 19:49 2018/11/1
     * @Param [admin, request]
     * @return java.lang.String
     * @exception
     */
    @RequestMapping("/login")
    public String login(Admin admin, HttpServletRequest request){
        System.out.println(admin);
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
            subject.hasRole("sss");
        }
        catch (UnknownAccountException ua){
            logger.info("没有指定的账户："+ua.getMessage());
            return "redirect:login.jsp";
        }
        catch (IncorrectCredentialsException ic){
            logger.info("密码不匹配 ："+ic.getMessage());
            return "redirect:login.jsp";
        }
        catch (LockedAccountException la){
            logger.info("用户被锁定  ："+la.getMessage());
            return "redirect:login.jsp";
        }
        catch (AuthenticationException ae){
            logger.info("登录失败："+ae.getMessage());
            return "redirect:login.jsp";
        }
        System.out.println(subject.getPrincipal());
//        // 执行登出，调用Subject的Logout()方法
//        subject.logout();
//
//        //安全退出
//        System.exit(0);
//        HttpSession session = request.getSession();
//        Admin admins = (Admin) SecurityUtils.getSubject().getPrincipal();
//        List<Menu> menuList = menuService.selectMenuByAdminUsername(admin.getUsername());
//        session.setAttribute("menuList",menuList);
//        session.setAttribute("admins",admins);
        return "redirect:index.jsp";
    }
}
