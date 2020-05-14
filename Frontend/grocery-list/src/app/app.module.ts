import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { GrocerylistComponent } from './grocerylist/grocerylist.component';
import { GroceryListComponent } from './component/grocery-list/grocery-list.component';

@NgModule({
  declarations: [
    AppComponent,
    GrocerylistComponent,
    GroceryListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
