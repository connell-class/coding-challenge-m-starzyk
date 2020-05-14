import { Component, OnInit } from '@angular/core';
import { GroceryServiceService } from 'src/app/service/grocery-service.service';

@Component({
  selector: 'app-grocery-list',
  templateUrl: './grocery-list.component.html',
  styleUrls: ['./grocery-list.component.css']
})
export class GroceryListComponent implements OnInit {
  glist = [];

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

  addItemToList(){
    return this.groceryService.addItemToList();
  }

}
