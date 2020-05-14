package com.shopping.dao;

import java.util.List;

public interface DaoContract <T>{

	List<T> getAllLists();
	void createGroceryList(T t);
	void addItemToList(T t);
	void removeItemFromList(int item);
	void removeGroceryList(T t);

}