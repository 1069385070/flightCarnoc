package com.carnoc.flight.dataMaintenance.service.impl;

import com.carnoc.flight.dataMaintenance.dao.BackUpDao;
import com.carnoc.flight.dataMaintenance.pojo.BackUp;
import com.carnoc.flight.dataMaintenance.service.BackUpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: BackUpServiceImpl
 * @Description: TODO 备份日志表实体类接口实现类
 * @Author: Administrator
 * @CreateDate: 2018/10/31 9:59
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/31 9:59
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service("backUpService")
public class BackUpServiceImpl implements BackUpService {
    @Resource
    private BackUpDao backUpDao;
    /**
     * @Author Administrator
     * @Description //TODO 添加一条备份日志记录
     * @Date 10:00 2018/10/31
     * @Param [backUp]
     * @return int
     * @exception
     */
    @Override
    public int addBackUp(BackUp backUp) {
        return backUpDao.addBackUp(backUp);
    }
    
    /**
     * @Author Administrator
     * @Description //TODO 查询所有备份日志记录
     * @Date 10:00 2018/11/4
     * @Param []
     * @return java.util.List<com.carnoc.flight.dataMaintenance.pojo.BackUp>
     * @exception
     */
    @Override
    public List<BackUp> selectAllBackUp() {
        return backUpDao.selectAllBackUp();
    }

    /**
     * @Author Administrator
     * @Description //TODO 还原数据库
     * @Date 11:00 2018/11/4
     * @Param [backUp]
     * @return int
     * @exception
     */
    @Override
    public int restoreMysql(BackUp backUp) {
        return backUpDao.restoreMysql(backUp);
    }
}
