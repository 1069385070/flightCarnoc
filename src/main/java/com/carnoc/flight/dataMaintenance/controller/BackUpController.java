package com.carnoc.flight.dataMaintenance.controller;

import com.carnoc.flight.dataMaintenance.dao.BackUpDao;
import com.carnoc.flight.dataMaintenance.pojo.BackUp;
import com.carnoc.flight.dataMaintenance.service.BackUpService;
import com.carnoc.flight.dataMaintenance.util.BackUpMysql;
import com.carnoc.flight.dataMaintenance.util.RestoreMysql;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: BackUpController
 * @Description: TODO
 * @Author: Administrator 备份日志记录处理类
 * @CreateDate: 2018/11/4 10:02
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/11/4 10:02
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
public class BackUpController {
    @Resource
    private BackUpService backUpService;

    @Resource
    private RestoreMysql restoreMysql;

    /**
     * @Author Administrator
     * @Description //TODO 查询所有备份日志记录
     * @Date 10:02 2018/11/4
     * @Param []
     * @return java.util.List<com.carnoc.flight.dataMaintenance.pojo.BackUp>
     * @exception
     */
    @RequestMapping("/selectAllBackUp")
    @ResponseBody
    public List<BackUp> selectAllBackUp(){
        List<BackUp> backUpList = backUpService.selectAllBackUp();
        return backUpList;
    }

    /**
     * @Author Administrator
     * @Description //TODO 还原数据库
     * @Date 11:17 2018/11/4
     * @Param [backUp]
     * @return int
     * @exception
     */
    @RequestMapping("/restoreMysql")
    @ResponseBody
    public String restoreMysql(BackUp backUp){
        System.out.println(backUp);
        int restore = restoreMysql.restore(backUp.getName());
        int i=0;
        if(restore==0){
            backUp.setBackupState(0);
            i= backUpService.restoreMysql(backUp);
        }
        System.out.println(i);
        return i+"";
    }

}
