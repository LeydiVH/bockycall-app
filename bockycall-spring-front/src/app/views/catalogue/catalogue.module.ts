import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ComponentsModule } from './components/components.module';
import { CatalogueComponent } from './catalogue.component';



@NgModule({
  declarations: [
    CatalogueComponent
  ],
  imports: [
    CommonModule,
    ComponentsModule
  ],
  exports: [
    CatalogueComponent
  ]
})
export class CatalogueModule { }
