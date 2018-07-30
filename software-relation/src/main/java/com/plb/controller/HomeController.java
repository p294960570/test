package com.plb.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.plb.common.model.ResultCode;

@Controller
@RequestMapping(value = "home")
public class HomeController {

	Logger log = Logger.getLogger(HomeController.class);

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ResultCode login(HttpServletRequest request, String userName, String password) {
		try {
			ResultCode resultCode = new ResultCode();
			resultCode = null;
			return resultCode;
		} catch (Exception e) {
			e.printStackTrace();
			return ResultCode.error();
		}
	}
}
