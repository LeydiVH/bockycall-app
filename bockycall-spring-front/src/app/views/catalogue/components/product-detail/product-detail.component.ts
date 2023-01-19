import { Component, Input } from '@angular/core';
import { Network } from '../../../../interfaces/network';
import { Recharge } from '../../../../interfaces/recharge';
import { Internet } from '../../../../interfaces/internet';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent {
 @Input() item: Recharge|Internet|Network;

 constructor() {
  this.item = {
    id: 1,
    price: 20,
    expiration: 7,
    description: "Obtenga el paquete de su preferencia.",
    image: "assets/images/products/recarga-3.png",
    internetQuantity: 50,
    socialNetworksName: "Facebook",
    catalogueId: 1,
  }
 }
}
