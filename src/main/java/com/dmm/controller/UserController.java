package com.dmm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.dmm.config.WebBase;
import com.dmm.model.User;
import com.dmm.service.UserService;
@Controller
public class UserController extends WebBase{
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response,Integer userid){
		ModelAndView mv = new ModelAndView("index");
		User user = userService.getUserById(userid);
		mv.addObject("user", user);
		return mv;
	}
	@RequestMapping("/findById")
	@ResponseBody
	public JSONObject findById(HttpServletRequest request,HttpServletResponse response){
		List<User> userList = userService.findAll();
		return returnSuccess(userList);
	}
}
