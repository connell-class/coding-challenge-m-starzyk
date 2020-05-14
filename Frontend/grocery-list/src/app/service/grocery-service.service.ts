import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpEvent } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { GroceryList } from '../model/grocery-list';

@Injectable({
  providedIn: 'root',
})
export class GroceryServiceService {
  constructor(private http: HttpClient) {}

  public getGroceryLists(): Promise<any> {
    return this.http
      .get<any>('http://localhost:8080/Grocery/grocery-lists.grocery')
      .toPromise();
  }

  createNewGroceryList(groceryList: GroceryList): Promise<GroceryList> {
    return this.http
      .post<GroceryList>(
        'http://localhost:8080/Grocery/grocery-lists/items.grocery',
        groceryList
      )
      .toPromise();
  }

  addItemToList(groceryList: GroceryList, id: number): Promise<any> {
    return this.http
      .post<GroceryList>(
        'http://localhost:8080/Grocery/grocery-lists/items' +
          `${id}` +
          '.grocery',
        groceryList
      )
      .toPromise();
  }

  deleteItemFromList(id: number): Promise<any> {
    return this.http
      .delete<GroceryList>(
        'http://localhost:8080/Grocery/grocery-lists/items/' +
          `${id}` +
          '.grocery'
      )
      .toPromise();
  }

  deleteGroceryList(id: number): Promise<any> {
    return this.http
      .delete<GroceryList>(
        'http://localhost:8080/Grocery/grocery-lists.grocery'
      )
      .toPromise();
  }
}
