package com.csg.jlyds.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.csg.jlyds.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private UserService us  = new UserService();
	public String findallcustomers(){
		List list = us.findCustomers();
		ServletActionContext.getRequest().setAttribute("cstms",list);
		return SUCCESS;
	}

}
