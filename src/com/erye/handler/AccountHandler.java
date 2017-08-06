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
		//计算出总钱数
		double moneySum = 0.0;
		if(null != accountList && accountList.size() > 0) {
			for(int i = 0; i < accountList.size(); i++) {
				moneySum += accountList.get(i).getSum();
			}
		}
		session.setAttribute("moneySum", moneySum);
		return "back/manager/account";
	}
	
	/**
	 * 添加进账
	 */
	@RequestMapping(value="/back/manage/account", method=RequestMethod.POST)
	public String accountHandler(Account account) {
		Double an = account.getAn()==null?0.0:account.getAn();
		Double han = account.getHan()==null?0.0:account.getHan();
		Double extraincome = account.getExtraincome()==null?0.0:account.getExtraincome();
		account.setSum(an + han + extraincome);
		accountService.addAccount(account);
		return "redirect:/back/manage/account";
	}
}
