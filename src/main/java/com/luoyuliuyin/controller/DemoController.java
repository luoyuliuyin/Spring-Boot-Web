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
 * Created by luoyuliuyin on 16-6-15.
 * demo测试
 */

@Controller
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("demo.do")
    private String Demo(HttpServletRequest request, ModelMap modelMap) {
        logger.info("message:{}", "demo");
        modelMap.put("message", "demo");
        return "demo.ftl";
    }

    @ResponseBody
    @RequestMapping("demo.json")
    private String DemoJson(HttpServletRequest request, ModelMap modelMap) {
        modelMap.put("message", "demo");
        return JSON.toJSONString(modelMap);
    }
}
