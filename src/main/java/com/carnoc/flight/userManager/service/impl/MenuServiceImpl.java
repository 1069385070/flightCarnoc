package com.carnoc.flight.userManager.service.impl;

import com.carnoc.flight.userManager.dao.MenuDao;
import com.carnoc.flight.userManager.pojo.Menu;
import com.carnoc.flight.userManager.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MenuServiceImpl
 * @Description: TODO 权限目录表f_menu实体类接口实现类
 * @Author: Administrator
 * @CreateDate: 2018/10/27 16:36
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/27 16:36
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    private List<String> la=new ArrayList<>();
    @Resource
    private MenuDao menuDao;
    /**
     * @Author Administrator
     * @Description //TODO 根据用户名查询该用户对应的权限
     * @Date 16:36 2018/10/27
     * @Param [username]
     * @return java.util.List<com.carnoc.flight.userManager.pojo.Menu>
     * @exception
     */
    @Override
    public List<Menu> selectMenuByAdminUsername(String username) {
        return menuDao.selectMenuByAdminUsername(username);
    }
    /**
     * @Author Administrator
     * @Description //TODO 根据权限父id查询该父id下所有的权限
     * @Date 19:50 2018/10/28
     * @Param [menuFid]
     * @return java.util.List<com.carnoc.flight.userManager.pojo.Menu>
     * @exception
     */
    @Override
    public List<Menu> selectMenuByMenuFId(int menuFid) {
        return menuDao.selectMenuByMenuFId(menuFid);
    }
    /**
     * @Author Administrator
     * @Description //TODO Administrator
     * @Date 19:53 2018/10/28
     * @Param [menuFid]
     * @return java.lang.StringBuffer
     * @exception
     */
    @Override
    public List<String> getNodesMenu(int menuFid) {
//        List<Menu> menuList = selectMenuByMenuFId(menuFid);
//        if(menuList!=null&&menuList.size()!=0) {
//            for (int i = 0; i < menuList.size(); i++) {
//                stringBuffer.append("<dl class='permission-list'>");
//                for (int j = 1; j < menuList.get(i).getGoods_sort_level(); j++) {
//                    stringBuffer.append("&nbsp;&nbsp;");
//                }
////                sb1.append(menuList.get(i).getGoods_sort_name()+"</option>");
////                getNodes1(menuList.get(i).getGoods_sort_id());
//            }
//        }
        List<Menu> menuList = selectMenuByMenuFId(0);
        List<String> stringList = createComboTreeTree(menuList, 0);
        return stringList;
    }
    public List<String> createComboTreeTree(List<Menu> menuList, int fid) {
        for (int i = 0; i < menuList.size(); i++) {
            StringBuffer stringBuffer=new StringBuffer();
            if(menuList.get(i).getFid()==0){
                stringBuffer.append("<dl class='permission-list'><dd>");
                stringBuffer.append("<dt><label class='middle'><input name='user-Character-0' class='ace' type='checkbox' id='id-disable-check"+menuList.get(i).getId()+"'><span class='lbl'>"+menuList.get(i).getName()+"</span></label></dt>");
                stringBuffer.append(createComboTreeChildren(menuList,menuList.get(i).getId()));
                stringBuffer.append("</dd></dl>");
            }
            la.add(stringBuffer.toString());
        }
        return la;
    }

    private StringBuffer createComboTreeChildren(List<Menu> menuList, int fid) {
        StringBuffer stringBuffer1=new StringBuffer();
        for (int i = 0; i < menuList.size(); i++) {
            if(menuList.get(i).getFid()==fid){
                stringBuffer1.append("<dl class='cl permission-list2'>");
                stringBuffer1.append("<dt><label class='middle'><input type='checkbox' value='' class='ace'  name='user-Character-0-0' id='id-disable-check"+menuList.get(i).getId()+"'><span class='lbl'>"+menuList.get(i).getName()+"</span></label></dt>");
                stringBuffer1.append(createComboTreeChildren(menuList,menuList.get(i).getId()));
                stringBuffer1.append("</dl>");
            }
        }
        return stringBuffer1;
    }






                        /*<dd>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-0"><span class="lbl">添加</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-1"><span class="lbl">修改</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-2"><span class="lbl">删除</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-3"><span class="lbl">查看</span></label>
                            <label class="middle"><input type="checkbox" value="" class="ace" name="user-Character-0-0-0" id="user-Character-0-0-4"><span class="lbl">审核</span></label>
                        </dd>*/





}
