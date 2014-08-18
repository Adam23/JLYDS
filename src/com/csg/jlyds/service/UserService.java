package com.csg.jlyds.service;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.csg.jlyds.dao.UserDAO;
import com.csg.jlyds.utils.DBUtils;

public class UserService {
	
	public Map findCustomers(int page , int rows){
		Session session = DBUtils.getSession();
		UserDAO dao  = new UserDAO(session);
		Map m = dao.findCustomer((page-1) * rows, rows);
		session.close();
		return m;
	}

}
