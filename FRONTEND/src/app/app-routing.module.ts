import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductGridComponent } from './product-grid/product-grid.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ProductComponent } from './product/product.component';


const routes: Routes = [
  { path:'Men/:categoryResourceId', component:ProductGridComponent },
  { path:'Women/:categoryResourceId', component:ProductGridComponent },
  { path:'Kids/:categoryResourceId', component:ProductGridComponent },
  { path:'mobile/:categoryResourceId', component:ProductGridComponent },
  { path:'home', component:HomeComponent },
  { path:'', redirectTo:'/home',pathMatch:'full'},
  { path:'**', redirectTo:'/home',pathMatch:'full'}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
