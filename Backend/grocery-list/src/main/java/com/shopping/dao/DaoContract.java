package com.shopping.dao;

import java.util.List;

import com.shopping.model.GroceryItem;

public interface DaoContract <T>{

	List<T> getAllLists();
	void createGroceryList(T t);
	void addItemToList(GroceryItem t);
	void removeItemFromList(int item);
	void removeGroceryList(T t);
	List<GroceryItem> getAllItems();

}