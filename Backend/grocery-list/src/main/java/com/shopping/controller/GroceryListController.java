package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shopping.model.GroceryList;
import com.shopping.service.GroceryListService;

@Controller
@CrossOrigin(origins = "*")
public class GroceryListController {
	
	@Autowired
	private GroceryListService gs;
	
	@RequestMapping(method = RequestMethod.GET, value = "/grocery-lists")
	public @ResponseBody List<GroceryList> findAll(){
		return gs.getAllGroceryLists();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/grocery-lists")
	public ResponseEntity<GroceryList> save(@RequestBody GroceryList gl){
		return new ResponseEntity<GroceryList>(gs.createGroceryList(gl), HttpStatus.OK);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/grocery-lists/items")
	public ResponseEntity<GroceryList> update(@RequestBody GroceryList gl){
		return new ResponseEntity<GroceryList>(gs.addItemToList(gl), HttpStatus.OK);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/grocery-lists/items/{itemId}")
	public ResponseEntity<String> deleteItem(@PathVariable("id") int id){
		gs.removeItemFromList(id);
		return new ResponseEntity<String>("deleted", HttpStatus.OK);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/grocery-lists")
	public ResponseEntity<String> deleteList(GroceryList gl){
		gs.removeGroceryList(gl);
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}
	
	
}
