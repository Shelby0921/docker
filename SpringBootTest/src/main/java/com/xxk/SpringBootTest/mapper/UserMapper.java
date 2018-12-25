package com.xxk.SpringBootTest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xxk.SpringBootTest.pojo.User;

@Mapper
public interface UserMapper {
	public List<User> getallUser();
}
