package com.csg.jlyds.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
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
	 
	 public Map findCustomer(int startIndex , int rows){
		 String hql = "from Customer ";
		 
		 Query q = session.createQuery(hql);
		 q.setFirstResult(startIndex);
		 q.setMaxResults(rows);
		 List<Customer> list = q.list();
		 
		 Map params = new HashMap();
		 int count = this.getRecordCount(hql, params);
		
		 Map result = new HashMap();
		 result.put("count", count);
		 result.put("data", list);
		 return result;
	 }

	private int getRecordCount(String hql, Map params) {
		String countHQL = "select count(*) " + hql;
		
		Query q = session.createQuery(countHQL);
		Iterator itr = params.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry)itr.next();
			q.setString(me.getKey().toString(), me.getValue().toString());
		}
		Long count = (Long)q.uniqueResult();
		return count.intValue();
	}
	
}
