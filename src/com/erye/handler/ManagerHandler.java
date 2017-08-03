package com.erye.handler;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.erye.entities.User;
import com.erye.service.ManagerService;

@Controller
public class ManagerHandler {

	@Autowired
	private ManagerService managerService;
	
	/**
	 * 查询出所有的user，跳到那个页面
	 */
	@RequestMapping(value="/back/manager/manageuser")
	public String manageUser(HttpSession session) {
		List<User> userList = managerService.queryUser();
		session.setAttribute("userList", userList);
		return "back/manager/manage_user";
	}
	
	/**
	 * 添加个访问用户
	 */
	@RequestMapping(value="/back/manage/user", method=RequestMethod.POST)
	public String addUser(User user) {
		managerService.addUser(user);
		return "forward:/back/manager/manageuser";
	}
	
	/**
	 * 删除个访问用户
	 */
	@RequestMapping(value="/back/manage/user/{name}", method=RequestMethod.DELETE)
	public String deleteUser(@PathVariable("name")String name) {
		managerService.deleteUser(name);
		return "redirect:/back/manager/manageuser";
	}
}
