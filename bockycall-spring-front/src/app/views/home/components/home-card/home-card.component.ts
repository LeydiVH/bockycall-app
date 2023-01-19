import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';
import { Catalogue } from '../../../../interfaces/catalogue';

@Component({
  selector: 'app-home-card',
  templateUrl: './home-card.component.html',
  styleUrls: ['./home-card.component.css']
})
export class HomeCardComponent {

  @Input() catalogue:Catalogue;

  constructor(private router: Router) {
    this.catalogue = {
      id: 1,
      catalogueName: 'Recargas',
      description: 'Obtenga minutos y SMS al instante.',
      icon: 'fa-solid fa-phone',
    };
  }

  goToCataloguePage(){
    localStorage.setItem("catalogueId", this.catalogue.id.toString());
    this.router.navigate(["/catalogue"])
  }

}
