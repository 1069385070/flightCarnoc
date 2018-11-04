package com.carnoc.flight.dataMaintenance.util;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Date;

/**
 * @ClassName: RestoreMysql
 * @Description: TODO
 * @Author: Administrator
 * @CreateDate: 2018/11/4 11:28
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/11/4 11:28
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service("restoreMysql")
public class RestoreMysql {
    public int restore(String url) {
        System.out.println("还原");
        String user = "root";
        String password = "root";
        String database = "flight_db"; // 需要备份的数据库名
        System.out.println("现在时间是" + new Date());
        Runtime runtime = Runtime.getRuntime();

        String cmd = "mysql  -h localhost" + " -u " + user + " -p" + password + " " + database;
        System.out.println(cmd);
        int processComplete=0;
        try {
            String filePath =  "E:\\flight_db\\"+url+".sql"; // sql文件路径
            System.out.println(filePath);
            String stmt = cmd + " < " + filePath;
            String[] command = {"cmd", "/c", stmt};
            Process process = runtime.exec(command);
            //若有错误信息则输出
            InputStream errorStream = process.getErrorStream();
            System.out.println(IOUtils.toString(errorStream, "utf-8"));
            //等待操作
            processComplete = process.waitFor();
            if (processComplete == 0) {
                System.out.println("还原成功.");
            }
            System.out.println(processComplete);
//            else {
//                throw new RuntimeException("还原数据库失败.");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return processComplete;
    }
}
