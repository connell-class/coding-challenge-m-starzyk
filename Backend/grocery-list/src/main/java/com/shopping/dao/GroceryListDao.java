package com.shopping.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.model.GroceryList;
import com.shopping.util.HibernateUtil;

@Repository
@Transactional
public class GroceryListDao implements DaoContract <GroceryList> {
	private SessionFactory sesfact;
	
	@Autowired
	public GroceryListDao(SessionFactory sse) {
		sesfact = sse;
	}
	
	@Override
	public List<GroceryList> getAllLists(){
		return sesfact.openSession().createQuery("from GroceryList", GroceryList.class).list();
	}
	
	@Override
	public void createGroceryList(GroceryList gl){
		sesfact.openSession().save(gl);
	}
	
	@Override
	public void addItemToList(GroceryList gl) {
		sesfact.getCurrentSession().update(gl);
	}
	
	@Override
	public void removeItemFromList(int item) {
		sesfact.getCurrentSession().delete(item);
	}
	
	@Override
	public void removeGroceryList(GroceryList gl){
		sesfact.getCurrentSession().delete(gl);
	}

}
