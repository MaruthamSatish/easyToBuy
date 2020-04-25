import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../common/product';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private productsURl="http://localhost:8082/product";
  private getByCategoryId="http://localhost:8082/product";

  constructor(private httpClient :HttpClient) { }
  getProductList():Observable<Product[]>{
    return this.httpClient.get<GetResponse>(this.productsURl).pipe(map(response=>response._embedded.product));
  }
  getProdsByCatId():Observable<Product[]>{
    const productsByCatIdUrl="";
    return this.httpClient.get<GetResponse>(this.productsURl).pipe(map(response=>response._embedded.product));
  }
  productsByCategory(categoryId):Observable<Product[]>{
  
    return this.httpClient.get<GetResponse>(this.getByCategoryId+categoryId).pipe(map(response=>response._embedded.product));
  }
}

interface GetResponse{
  _embedded:{
    product:Product[];
  }
}
