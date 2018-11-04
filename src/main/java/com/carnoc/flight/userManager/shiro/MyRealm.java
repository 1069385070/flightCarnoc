package com.carnoc.flight.userManager.shiro;

import com.alibaba.fastjson.JSON;
import com.carnoc.flight.redis.RedisCache;
import com.carnoc.flight.userManager.pojo.Admin;
import com.carnoc.flight.userManager.pojo.Menu;
import com.carnoc.flight.userManager.service.AdminService;
import com.carnoc.flight.userManager.service.MenuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MyRealm
 * @Description: TODO 自定义MyRealm
 * @Author: Administrator
 * @CreateDate: 2018/10/26 20:02
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/26 20:02
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

public class MyRealm extends AuthorizingRealm{
    private static Logger logger= LogManager.getLogger(MyRealm.class);
    @Resource
    private AdminService adminService;
    @Resource
    private MenuService menuService;

    @Resource
    private RedisCache redisCache;

    private String password;
    /**
     * @Author Administrator
     * @Description //TODO 授权
     * @Date 20:05 2018/10/26
     * @Param [principalCollection]
     * @return org.apache.shiro.authz.AuthorizationInfo
     * @exception
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        //获取登录的用户名
//        Admin admin= (Admin)principals.getPrimaryPrincipal();
//        System.out.println(admin);
//        logger.info("进来了授权");
//        List<String> la=new ArrayList<>();
//        List<Menu> menuList = menuService.selectMenuByAdminUsername(admin.getUsername());
//        for (Menu menu:menuList){
//            if(menu.getMenuCode()!=null){
//                la.add(menu.getMenuCode());
//            }
//        }
//        System.out.println(la);
//        simpleAuthorizationInfo.addStringPermissions(la);
//        if("admin".equals(admin.getUsername())){
//            //两个if根据判断赋予登录用户权限
//            //simpleAuthorizationInfo.addStringPermission("admin:create");
//            simpleAuthorizationInfo.addRole("admin");
//            System.out.println("admin账号");
//        }
//        if("user1".equals(admin.getUsername())){
//            simpleAuthorizationInfo.addRole("list");
//            System.out.println("list账号");
//        }
//        simpleAuthorizationInfo.addRole("user");
//        return simpleAuthorizationInfo;
        System.out.println("进来了授权");
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        //获取登录的用户名
        Object principal = principals.getPrimaryPrincipal();
        List<String> la=new ArrayList<>();
        List<Menu> list=new ArrayList<>();
        List<Menu> menuList =null;
        //先从redis中获取
//        String key="com.carnoc.flight.userManager.dao.MenuDao.selectMenuByAdminUsername."+(String) principal;
//        String data = redisCache.getDataFromRedis(key);
//        if(data==null){
//            //没有就查询数据库
//            menuList=menuService.selectMenuByAdminUsername((String) principal);
//            //先把集合对象转换成json
//            String string = JSON.toJSONString(menuList);
//            //把查询的结果放入到redis中
//            redisCache.setDataToRedis(key,string);
//        }else{
//            //将data转换成对象集合
//            menuList=JSON.parseArray(data,Menu.class);
//        }
        menuList=menuService.selectMenuByAdminUsername((String) principal);
        for (Menu menu:menuList){
            if(menu.getMenuCode()!=null){
                la.add(menu.getMenuCode());
            }
            if(menu.getMenuCode()==null){
                list.add(menu);
            }
        }
        System.out.println(la);
        System.out.println(list);
        info.addStringPermissions(la);
        if("admin".equals(principal)){
            info.addRole("admin");
        }
        if("user".equals(principal)){
            info.addRole("list");
        }
        info.addRole("user");
        HttpServletRequest req=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        req.getSession().setAttribute("menuList",list);
        return info;
        //return null;
    }
    
    /**
     * @Author Administrator
     * @Description //TODO 用户验证
     * @Date 20:05 2018/10/26
     * @Param [authenticationToken]
     * @return org.apache.shiro.authc.AuthenticationInfo
     * @exception
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取登录的 username
//        UsernamePasswordToken usernamePasswordToken=(UsernamePasswordToken) token;
        Object principal = token.getPrincipal();
        //System.out.println(usernamePasswordToken);
        //利用 username 查询数据库得到用户的信息.
//        Users users = usersService.selectUsersByUsername(usernamePasswordToken.getUsername());
        Admin admin = adminService.selectAdminByUsername((String) principal);
        logger.info("admin:"+admin);
        if(admin!=null){
            password=admin.getPassword();
            //password= CryptoUtils.encodeSHA(users.getPassword());
        }else{
            logger.info("没有指定的账户：");
        }
        //users.setPassword(CryptoUtils.encodeSHA(users.getPassword()));
        //System.out.println(users.getPassword());
        String credentials = password;
        System.out.println(credentials);
        String source = "abcdefg";
        ByteSource credentialsSalt = new Md5Hash(source);
        logger.info("credentialsSalt:"+credentialsSalt);
        //当前 Realm 的name
        String realmName = getName();
        logger.info("realmName:"+realmName);
        //返回值实例化
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
        System.out.println(this.getName());
//        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(admin, password, this.getName());
        System.out.println(simpleAuthenticationInfo);
        //User user = (User) SecurityUtils.getSubject().getPrincipal()
        return simpleAuthenticationInfo;
    }

    //init-method 配置.
    public void setCredentialMatcher(){
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        credentialsMatcher.setHashAlgorithmName("MD5");//MD5算法加密
        credentialsMatcher.setHashIterations(1024);//1024次循环加密
        setCredentialsMatcher(credentialsMatcher);
    }

    //MD5加密方法(注册时密码存入数据库时使用)
    public static String md5(String passWord){
        String saltSource = "abcdefg"; //加的盐值
        String hashAlgorithmName = "MD5";
        Object salt = new Md5Hash(saltSource);
        int hashIterations = 1024;
        Object result = new SimpleHash(hashAlgorithmName, passWord, salt, hashIterations);
        String password = result.toString();
        return password;
    }

    //用来测试的算出密码password盐值加密后的结果，下面方法用于新增用户添加到数据库操作的
    public static void main(String[] args) {
        String saltSource = "abcdefg";
        String hashAlgorithmName = "MD5";
        String credentials = "123456";
        Object salt = new Md5Hash(saltSource);
        int hashIterations = 1024;
        Object result = new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
        System.out.println(result);
    }
}
