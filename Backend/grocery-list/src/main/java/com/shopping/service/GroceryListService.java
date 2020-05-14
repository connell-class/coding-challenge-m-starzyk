package com.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.dao.DaoContract;
import com.shopping.model.GroceryList;

@Service
public class GroceryListService {
	private DaoContract<GroceryList> dc;
	
	@Autowired
	public void setdao(DaoContract<GroceryList> dc) {
		this.dc = dc;
	}
	
	public List<GroceryList> getAllGroceryLists(){
		return dc.getAllLists();
	}
	
	public void createGroceryList(GroceryList gl) {
		dc.createGroceryList(gl);
	}
	
	public void addItemToList(GroceryList gl) {
		dc.addItemToList(gl);
	}
	
	public void removeItemFromList(String item) {
		dc.removeItemFromList(item);;
	}
	
	public void removeGroceryList(GroceryList gl){
		dc.removeGroceryList(gl);
	}
	
	
}
