package com.luoyuliuyin.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jingfeng on 16-6-15.
 * demo测试
 */

@Controller
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/")
    private String demo(HttpServletRequest request, ModelMap modelMap) {
        logger.info("message:{}", "demo");
        modelMap.put("message", "demo");
        modelMap.put("contextPath", request.getContextPath());
        return "demo.ftl";
    }

    //@ResponseBody 在使用此注解之后不会再走试图处理器，而是直接将数据写入到输入流中
    @ResponseBody
    @RequestMapping("demo.json")
    private String demoJson(HttpServletRequest request, ModelMap modelMap) {
        modelMap.put("message", "demo");
        return JSON.toJSONString(modelMap);
    }
}
