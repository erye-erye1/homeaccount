package com.erye.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.erye.entities.Account;
import com.erye.entities.Manager;

@Repository
public interface ManagerMapper {

	/**
	 * 通过用户名和密码，查询TBL_MANAGER
	 */
	public Manager queryManagerByNameAndPwd(Manager manager);
	
	
	/**
	 * 查询account账户的财产总额
	 */
	public List<Account> queryAccount();

	/**
	 * 插入收入
	 */
	public void addAccount(Account account);
}
