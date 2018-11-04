package com.carnoc.flight.dataMaintenance.util;

import com.carnoc.flight.dataMaintenance.pojo.BackUp;
import com.carnoc.flight.dataMaintenance.service.BackUpService;
import org.apache.commons.io.IOUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * @ClassName: BackUpMysql
 * @Description: TODO
 * @Author: Administrator
 * @CreateDate: 2018/10/31 8:56
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/31 8:56
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Component
public class BackUpMysql {
//    public static void main(String[] args) {
//        back();
//    }
    @Resource
    private BackUpService backUpService;

    //@Scheduled(cron="0/5 * *  * * ? ")   //表示每隔5s执行一次
    //cron=" * * 0/1 * * ? "   //表示每隔1小时执行一次
    @Scheduled(cron="5/65 * *  * * ? ")
    public void back(){
        System.out.println("现在时间是"+new Date());
        Runtime runtime = Runtime.getRuntime();  //获取Runtime实例
        String user = "root";
        String password = "root";
        String database1 = "flight_db"; // 需要备份的数据库名
        String table1 = "t_user";
        String table2 = "t_user2";
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String sdfDate = sdf.format(currentDate);
        String filepath = "e:\\flight_db\\time_" + sdfDate + ".sql"; // 备份的路径地址
        //执行命令
        String stmt = "mysqldump  -h localhost -u "+user+" -p"+password+" --databases "+database1 +" > "+filepath;
        System.out.println(stmt);
        try {
            //添加一条备份日志记录
            BackUp backUp = new BackUp();
            backUp.setName("time_"+sdfDate);
            backUp.setAddTime(sdfDate);
            backUp.setBackupState(1);
            int i = backUpService.addBackUp(backUp);
            String[] command = { "cmd", "/c", stmt};
            Process process = runtime.exec(command);
            InputStream input = process.getInputStream();
            System.out.println(IOUtils.toString(input, "GBK"));

            //若有错误信息则输出
            InputStream errorStream = process.getErrorStream();
            System.out.println(IOUtils.toString(errorStream, "GBK"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
