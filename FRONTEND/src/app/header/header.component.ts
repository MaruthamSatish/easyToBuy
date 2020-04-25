import { Component, OnInit } from '@angular/core';
import { CatgeoryService } from '../services/catgeory.service';
import { Category } from '../common/category';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  categories :Category[];
  constructor(private catgeoryService :CatgeoryService, private activatedRoutes: ActivatedRoute) { }
  categoryResourceId: number;
  ngOnInit(): void {
    this.activatedRoutes.paramMap.subscribe(()=>{
      this.getCategoryList();
    });
   
  }
  getCategoryList(){
    const hasCategoryId: boolean=this.activatedRoutes.snapshot.paramMap.has('categoryResourceId');
   // this.categoryResourceId  =+this.activatedRoutes.snapshot.paramMap.get();
    this.catgeoryService.getCategoryList().subscribe(
      data => {
      this.categories=data;
    })
  }
  productsByCategory(categoryId){
    console.log(categoryId.categoryResourceId);
  }
}
