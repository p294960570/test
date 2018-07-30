package com.plb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	
	@RequestMapping("/test_page")
	public String test(ModelMap map){
        String runTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        map.addAttribute("date", runTime);
        System.out.println("进入controller里,当前时间："+runTime);
        return "test";
    }
	
}
