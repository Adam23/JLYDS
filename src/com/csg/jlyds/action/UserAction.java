package com.csg.jlyds.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.csg.jlyds.entity.Customer;
import com.csg.jlyds.service.UserService;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private int page;
	private int rows;
	private UserService us  = new UserService();
	
	public String findallcustomers() throws IOException{
		Map map = us.findCustomers(page, rows);
		//得到数据格式  {total:100 , rows:[{a:'a' , b:'b'}]}
		
		int count = (Integer) map.get("count");
		List<Customer> list = (List) map.get("data");
		
		Map outHM = new HashMap();
		outHM.put("totle", count);
		outHM.put("rows", list);
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(new Gson().toJson(outHM));
		return null;
	}
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}

}
