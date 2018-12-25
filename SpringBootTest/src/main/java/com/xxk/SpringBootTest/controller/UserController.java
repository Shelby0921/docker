package com.xxk.SpringBootTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxk.SpringBootTest.mapper.UserMapper;
import com.xxk.SpringBootTest.pojo.User;

@Controller
public class UserController {
	@Autowired
	private UserMapper userMapper;
	@ResponseBody
	@RequestMapping("index")
	public List index(){
		List<User> list = userMapper.getallUser();
		
		return list;
	}
}
