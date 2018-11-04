package com.carnoc.flight.dataMaintenance.dao;

import com.carnoc.flight.dataMaintenance.pojo.BackUp;

import java.util.List;

/**
 * @ClassName: BackUpDao
 * @Description: TODO 备份日志表实体类接口
 * @Author: Administrator
 * @CreateDate: 2018/10/31 9:56
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/31 9:56
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface BackUpDao {
    /**
     * @Author Administrator
     * @Description //TODO 添加一条备份日志记录
     * @Date 10:00 2018/10/31
     * @Param [backUp]
     * @return int
     * @exception
     */
    public int addBackUp(BackUp backUp);
    
    /**
     * @Author Administrator
     * @Description //TODO 查询所有备份日志记录
     * @Date 9:59 2018/11/4
     * @Param []
     * @return java.util.List<com.carnoc.flight.dataMaintenance.pojo.BackUp>
     * @exception
     */
    public List<BackUp> selectAllBackUp();
    
    /**
     * @Author Administrator
     * @Description //TODO 还原数据库
     * @Date 11:00 2018/11/4
     * @Param [backUp]
     * @return int
     * @exception
     */
    public int restoreMysql(BackUp backUp);
}
