package com.shopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroceryList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="list_id")
	private int id;
	@Column(name="list_owner")
	private String name;
	@Column(name="date_created")
	private String date;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public GroceryList(int id, String name, String date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	public GroceryList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GroceryList [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

}
