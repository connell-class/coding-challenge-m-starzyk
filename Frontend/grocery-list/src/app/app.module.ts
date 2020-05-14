import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { GrocerylistComponent } from './grocerylist/grocerylist.component';

@NgModule({
  declarations: [
    AppComponent,
    GrocerylistComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
