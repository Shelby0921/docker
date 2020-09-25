package com.xxk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xxk.pojo.User;

@Mapper
public interface UserMapper {

	public List<User> getallUser();
}
