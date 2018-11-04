package com.carnoc.flight.userManager.util;

import org.apache.shiro.session.SessionException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @ClassName: SystemLogoutFilter
 * @Description: TODO 退出过滤器
 * @Author: Administrator
 * @CreateDate: 2018/11/1 19:17
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/11/1 19:17
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class SystemLogoutFilter extends LogoutFilter {
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        //在这里执行退出系统前需要清空的数据
        Subject subject=getSubject(request,response);
        String redirectUrl=getRedirectUrl(request,response,subject);
        ServletContext context= request.getServletContext();
        try {
            subject.logout();
            context.removeAttribute("error");
        }catch (SessionException e){
            e.printStackTrace();
        }
        issueRedirect(request,response,redirectUrl);
        return false;
    }
}
