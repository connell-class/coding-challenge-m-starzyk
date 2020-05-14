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
	
	public GroceryList createGroceryList(GroceryList gl) {
		dc.createGroceryList(gl);
		return gl;
	}
	
	public GroceryList addItemToList(GroceryList gl) {
		dc.addItemToList(gl);
		return gl;
	}
	
	public void removeItemFromList(int item) {
		dc.removeItemFromList(item);;
	}
	
	public void removeGroceryList(GroceryList gl){
		dc.removeGroceryList(gl);
	}
	
	
}
