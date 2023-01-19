import { Component, OnInit } from '@angular/core';
import { CatalogueService } from '../../services/catalogue.service';
import { Catalogue } from '../../interfaces/catalogue';
import { Recharge } from '../../interfaces/recharge';
import { Network } from '../../interfaces/network';
import { Internet } from '../../interfaces/internet';
import { Router } from '@angular/router';
declare var $: any;

@Component({
  selector: 'app-catalogue',
  templateUrl: './catalogue.component.html',
  styleUrls: ['./catalogue.component.css']
})
export class CatalogueComponent implements OnInit {
  catalogue: Catalogue;
  rechargeList: Recharge[] = [];
  internetList: Internet[] = [];
  socialNetworkList: Network[] = [];
  selectedItem: Recharge|Internet|Network;

  constructor(private catalogueService: CatalogueService, private router: Router) {
    this.catalogue = {
      id: 1,
      catalogueName: 'Recargas',
      description: 'Obtenga minutos y SMS al instante.',
      icon: 'fa-solid fa-phone',
    };
    this.selectedItem = {
      id: 1,
      price: 20,
      expiration: 7,
      description: "Obtenga el paquete de su preferencia.",
      image: "assets/images/products/recarga-3.png",
      internetQuantity: 50,
      socialNetworksName: "Facebook",
      catalogueId: 1,
    };
  }
  ngOnInit(): void {
    this.getCatalogueData();
  }

  getCatalogueData() {
    let catalogueId: number = parseInt(localStorage.getItem("catalogueId") || "1");
    this.catalogueService.getCatalogueById(catalogueId).subscribe((catalogue: Catalogue) => {
      this.catalogue = catalogue;
    });

    switch (catalogueId) {
      case 1:
        this.catalogueService.getRechargeList().subscribe((rechargeList: Recharge[]) => {
          this.rechargeList = rechargeList;
        });
        break;
      case 2:
        this.catalogueService.getInternetList().subscribe((internetList: Internet[]) => {
          this.internetList = internetList;
        });
        break;
      case 3:
        this.catalogueService.getSocialNetworkList().subscribe((socialNetworkList: Network[]) => {
          this.socialNetworkList = socialNetworkList;
        });
        break;    
      default:
        this.router.navigate(["/error"]);
        break;
    }
  }

  getSelectedItem(item: Recharge|Internet|Network) {
    this.selectedItem = item;
    $('#productInfoModal').modal('show');
  }
}
