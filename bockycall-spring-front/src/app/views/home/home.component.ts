import { Component, OnInit } from '@angular/core';
import { CatalogueService } from '../../services/catalogue.service';
import { Catalogue } from '../../interfaces/catalogue';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  catalogueList: Catalogue[] = [];

  constructor(private catalogueService: CatalogueService) {
  
  }
  ngOnInit(): void {
    this.getCatalogueList();
  }

  getCatalogueList() {
    this.catalogueService.getCatalogueList().subscribe((catalogueList: Catalogue[]) => {
      this.catalogueList = catalogueList;
    })
  }
}
