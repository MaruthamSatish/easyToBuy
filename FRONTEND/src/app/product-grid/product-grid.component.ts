import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { Product } from '../common/product';

@Component({
  selector: 'app-product-grid',
  templateUrl: './product-grid.component.html',
  styleUrls: ['./product-grid.component.css']
})
export class ProductGridComponent implements OnInit {
  products: Product[];
  constructor(private productService:ProductService) { }
 ngOnInit(): void {
   this.getProductList();
  }
  getProductList(){
    this.productService.getProductList().subscribe(
      data => {
      this.products=data;
    })
  }
}
