package com.xxk.controller;

import java.util.List;

import com.xxk.mapper.UserMapper;
import com.xxk.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/index")
	public List index(){
		List<User> list = userMapper.getallUser();
		return list;
	}
}
