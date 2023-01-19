import { NgModule } from '@angular/core';
import { ErrorComponent } from './error/error.component';
import { CommonModule } from '@angular/common';
import { HomeModule } from './home/home.module';
import { CatalogueModule } from './catalogue/catalogue.module';



@NgModule({
  declarations: [
    ErrorComponent,
  ],
  imports: [
    CommonModule,
    HomeModule,
    CatalogueModule
  ],
  exports: [
    HomeModule,
    CatalogueModule,
  ]
})
export class ViewsModule { }
