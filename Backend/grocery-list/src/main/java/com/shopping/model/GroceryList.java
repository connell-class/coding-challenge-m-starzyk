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

}
