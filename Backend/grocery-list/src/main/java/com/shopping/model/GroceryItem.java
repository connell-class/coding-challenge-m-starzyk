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

}
