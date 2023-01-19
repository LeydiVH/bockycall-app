import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Network } from '../../../../interfaces/network';
import { Internet } from '../../../../interfaces/internet';
import { Recharge } from '../../../../interfaces/recharge';

@Component({
  selector: 'app-product-card',
  templateUrl: './product-card.component.html',
  styleUrls: ['./product-card.component.css']
})
export class ProductCardComponent {
  @Input() item: Recharge|Internet|Network;
  @Output() selectedITem: EventEmitter<Recharge|Internet|Network> = new EventEmitter();

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

  setSelectedItem() {
    this.selectedITem.emit(this.item);
  }
}
