package com.erye.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.erye.entities.Manager;
import com.erye.service.ManagerService;

@Controller
public class LoginHandler {

	@Autowired(required=false)
	private ManagerService managerService;
	
	/**
	 * 登录
	 */
	@RequestMapping("/family/account/login")
	public String login(Manager manager) {
		String login = managerService.login(manager);
		if("admin".equals(login)) {
			return "back/manager/back_manager_page";
		}else if("user".equals(login)) {
			return "";
		}else {
			return "redirect:/index.jsp";
		}
	}
}
