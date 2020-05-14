import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpEvent } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { GroceryList } from '../model/grocery-list';
import { Groceries } from '../model/groceries';

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

  public getGroceryItems(): Promise<Groceries> {
    return this.http
      .get<Groceries>('http://localhost:8080/Grocery/grocery-items.grocery')
      .toPromise();
  }

  createNewGroceryList(groceryList: GroceryList): Promise<GroceryList> {
    return this.http
      .post<GroceryList>(
        'http://localhost:8080/Grocery/grocery-lists.grocery',
        groceryList
      )
      .toPromise();
  }

  addItemToList(groceries: Groceries): Promise<any> {
    return this.http
      .post<Groceries>(
        'http://localhost:8080/Grocery/grocery-lists/items.grocery',
        groceries
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
