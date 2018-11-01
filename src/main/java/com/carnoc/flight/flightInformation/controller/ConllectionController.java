package com.carnoc.flight.flightInformation.controller;

import com.alibaba.fastjson.JSON;
import com.carnoc.flight.flightInformation.pojo.Conllection;
import com.carnoc.flight.flightInformation.service.ConllectionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: lpf
 * @Date 2018/10/31/031  9:45
 **/
@Controller
public class ConllectionController {

    @Resource
    private ConllectionService conllectionService;

    /**
     * 获得自动采集接口
     */
    @RequestMapping(value = "/conllection.do")
    @ResponseBody
    public List<Conllection> conllection(){
        List<Conllection> allPort = conllectionService.getAllPort();
        System.out.println(allPort);
        return allPort;
    }

    /**
     * 修改自动采集接口
     * @param conllection
     * @return
     */
    @RequestMapping("/updataPortStatus.do")
    @ResponseBody
    public int updataPortStatus(Conllection conllection){
        int result = conllectionService.updataPortStatus(conllection);
        return result;
    }


    @RequestMapping(value = "/delPortStarusById.do")
    @ResponseBody
    public int delPortStarusById(int id){
        int result = conllectionService.delPortStarusById(id);
        return result;
    }


}
