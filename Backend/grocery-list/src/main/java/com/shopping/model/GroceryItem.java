package com.shopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="grocery_item")
public class GroceryItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="item_id")
	private int id;
	@Column(name="item_name", unique = true, nullable = false)
	private String name;
	@Column(name="item_type", nullable = false)
	private String type;
	@Column(name="list_id")
	private int listId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getListId() {
		return listId;
	}
	public void setListId(int listId) {
		this.listId = listId;
	}
	@Override
	public String toString() {
		return "GroceryItem [id=" + id + ", name=" + name + ", type=" + type + ", listId=" + listId + "]";
	}
	public GroceryItem(int id, String name, String type, int listId) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.listId = listId;
	}
	public GroceryItem() {
		super();
		// TODO Auto-generated constructor stub
	}

}
