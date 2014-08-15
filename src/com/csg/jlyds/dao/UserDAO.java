package com.csg.jlyds.dao;

import java.util.List;

import org.hibernate.Session;

import com.csg.jlyds.entity.Customer;

public class UserDAO {
	private Session session = null;
	
	public UserDAO(Session session){
		 this.session = session;
	 }

	 public void save(Customer cstm){
		 session.save(cstm);
	 }
	 
	 public List findCustomer(){
		 String hql = "from Customer ";
		 List<Customer> list = session.createQuery(hql).list();
		 return list;
	 }
	
}
