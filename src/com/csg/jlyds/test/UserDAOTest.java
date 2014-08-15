package com.csg.jlyds.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import com.csg.jlyds.dao.UserDAO;
import com.csg.jlyds.entity.Customer;
import com.csg.jlyds.utils.DBUtils;

public class UserDAOTest {

	@Test
	public void testFindCustomer() {
		Session session = DBUtils.getSession();
		UserDAO dao  = new UserDAO(session);
		List<Customer> list = dao.findCustomer();
		for(Customer c:list){
			System.out.println(c.getCustomerName());
		}
		session.close();
	}

}
