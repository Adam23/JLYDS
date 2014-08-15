package com.csg.jlyds.service;

import java.util.List;

import org.hibernate.Session;

import com.csg.jlyds.dao.UserDAO;
import com.csg.jlyds.utils.DBUtils;

public class UserService {
	Session session  = DBUtils.getSession();
	UserDAO dao  = new UserDAO(session);
	
	public List findCustomers(){
		return dao.findCustomer();
	}

}
