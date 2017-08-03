package com.erye.mapper;

import java.util.List;

import com.erye.entities.User;

public interface UserMapper {

	/**
	 * 添加用户
	 */
	public Integer addUser(User user);

	public List<User> queryUser();
}
