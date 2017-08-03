package com.erye.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.erye.entities.User;

public interface UserMapper {

	/**
	 * 添加用户
	 */
	public Integer addUser(User user);

	/**
	 * 查询用户
	 */
	public List<User> queryUser();

	/**
	 * 根据用户名删除用户
	 */
	public void deleteUser(@Param("name")String name);
}
