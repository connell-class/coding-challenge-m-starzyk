import { Component, OnInit } from '@angular/core';
import { GroceryServiceService } from 'src/app/service/grocery-service.service';
import { GroceryList } from 'src/app/model/grocery-list';

@Component({
  selector: 'app-grocery-list',
  templateUrl: './grocery-list.component.html',
  styleUrls: ['./grocery-list.component.css']
})
export class GroceryListComponent implements OnInit {
  glist = [];
  id: number;
  groceryList: GroceryList;

  constructor(private groceryService: GroceryServiceService) { }

  ngOnInit(): void {
    this.getTheList();
  }

  getTheList(){
    return this.groceryService
    .getGroceryLists()
    .then((response) => this.populateTable(response));
  }

  populateTable(response) {
    for (let i = 0; i < response.length; i++) {
      this.glist.push(response[i]);
    }
  }

  deleteGroceryList(id) {
    return this.groceryService.deleteGroceryList(id);
  }

  addItemToList(id){
    return this.groceryService.addItemToList(id);
  }

}
