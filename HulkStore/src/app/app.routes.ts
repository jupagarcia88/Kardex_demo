import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ProductsComponent } from './components/products/products.component';
import { ShowProductsComponent } from './components/show-products/show-products.component';
import { SaleProductComponent } from './components/sale-product/sale-product.component';
import { AddProductComponent } from './components/add-product/add-product.component';

const APP_ROUTES: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'products', component: ProductsComponent},
  { path: 'showProducts', component: ShowProductsComponent},
  { path: 'saleProducts', component: SaleProductComponent},
  { path: 'addProducts', component: AddProductComponent},
  { path: '**', pathMatch: 'full', redirectTo: 'home' }
];

export const APP_ROUTING = RouterModule.forRoot(APP_ROUTES);
