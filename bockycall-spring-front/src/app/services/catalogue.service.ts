import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Catalogue } from '../interfaces/catalogue';
import { environment } from '../../environments/environment';
import { Recharge } from '../interfaces/recharge';
import { Internet } from '../interfaces/internet';
import { Network } from '../interfaces/network';

@Injectable({
  providedIn: 'root'
})
export class CatalogueService {

  constructor(private httpClient: HttpClient) {

  }

  public getCatalogueList(): Observable<Catalogue[]> {
    return this.httpClient.get<Catalogue[]>(`${environment.catalogueUrl}/catalogue`);
  }

  getCatalogueById(id: number) {
    return this.httpClient.get<Catalogue>(`${environment.catalogueUrl}/catalogue/${id}`);
  }

  getRechargeList() {
    return this.httpClient.get<Recharge[]>(`${environment.catalogueUrl}/catalogue/recharge`);
  }

  getRechargeById(id: number) {
    return this.httpClient.get<Recharge>(`${environment.catalogueUrl}/catalogue/recharge/${id}`);
  }

  getInternetList() {
    return this.httpClient.get<Internet[]>(`${environment.catalogueUrl}/catalogue/internet`);
  }

  getInternetById(id: number) {
    return this.httpClient.get<Internet>(`${environment.catalogueUrl}/catalogue/internet/${id}`);
  }

  getSocialNetworkList() {
    return this.httpClient.get<Network[]>(`${environment.catalogueUrl}/catalogue/network`);
  }

  getSocialNetwork(id: number) {
    return this.httpClient.get<Network>(`${environment.catalogueUrl}/catalogue/network/${id}`);
  }

}
