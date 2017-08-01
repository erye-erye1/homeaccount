package com.erye.mapper;

import org.springframework.stereotype.Repository;

import com.erye.entities.Manager;

@Repository
public interface ManagerMapper {

	/**
	 * 通过用户名和密码，查询TBL_MANAGER
	 */
	public Manager queryManagerByNameAndPwd(Manager manager);
	
	/**
	 * 修改管理员名字或者密码
	 */
	public void updateManagerNameOrPwd(Manager manager);
	
}
