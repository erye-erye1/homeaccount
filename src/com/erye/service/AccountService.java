package com.erye.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erye.entities.Account;
import com.erye.mapper.ManagerMapper;

@Service
public class AccountService {

	@Autowired
	private ManagerMapper managerMapper;
	
	/**
	 * 查询account账户的总体情况
	 */
	public List<Account> queryAccount() {
		return managerMapper.queryAccount();
	}
	
	/**
	 * 插入收入
	 */
	public void addAccount(Account account) {
		managerMapper.addAccount(account);
	}
}
