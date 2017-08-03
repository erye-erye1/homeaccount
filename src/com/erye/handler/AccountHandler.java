package com.erye.handler;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.erye.entities.Account;
import com.erye.service.AccountService;

@Controller
public class AccountHandler {

	@Autowired
	private AccountService accountService;
	
	/**
	 * 处理查询总账户
	 */
	@RequestMapping(value="/back/manage/account", method=RequestMethod.GET)
	public String accountHandler(HttpSession session) {
		List<Account> accountList = accountService.queryAccount();
		session.setAttribute("accountList", accountList);
		return "back/manager/account";
	}
	
	/**
	 * 添加进账
	 */
	@RequestMapping(value="/back/manage/account", method=RequestMethod.POST)
	public String accountHandler(Account account) {
		account.setSum(account.getAn() + account.getHan() + account.getExtraincome());
		accountService.addAccount(account);
		return "redirect:/back/manage/account";
	}
}
