import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { GroceryListComponent } from './component/grocery-list/grocery-list.component';
import { GroceryListsComponent } from './component/grocery-lists/grocery-lists.component';

@NgModule({
  declarations: [
    AppComponent,
    GroceryListComponent,
    GroceryListsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
