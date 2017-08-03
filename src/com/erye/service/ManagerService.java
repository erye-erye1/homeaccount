package com.erye.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erye.entities.User;
import com.erye.mapper.UserMapper;

@Service
public class ManagerService {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 添加新的用户
	 */
	public Integer addUser(User user) {
		Integer n = userMapper.addUser(user);
		return n;
	}
	
	/**
	 * 查询所有用户
	 */
	public List<User> queryUser() {
		return userMapper.queryUser();
	}

	/**
	 * 根据用户名删除用户
	 * @param name : 用户名
	 */
	public void deleteUser(String name) {
		userMapper.deleteUser(name);
	}
	
}
