package com.shopping.dao;

import java.util.List;

public interface DaoContract <T>{

	List<T> getAllLists();
	void createGroceryList(T t);
	void addItemToList(T t);
	void removeItemFromList(String item);
	void removeGroceryList(T t);

}