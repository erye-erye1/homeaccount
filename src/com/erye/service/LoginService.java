package com.erye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erye.entities.Manager;
import com.erye.mapper.ManagerMapper;

@Service
public class LoginService {

	@Autowired
	private ManagerMapper managerMapper;
	
	/**
	 * 登录
	 * return:true:可以登录；false:不可以登录
	 */
	public String login(Manager manager) {
		//首先查询manager表，能查到信息就是超级用户
		Manager queryManager = managerMapper.queryManagerByNameAndPwd(manager);
		if(null != queryManager) {
			return "admin";
		}/*else {
			//查询user表，能查到就登录
			if() {
				
			}else {
				//不能查到就不让登录
				
			}
		}*/
		return null;
	}
}
