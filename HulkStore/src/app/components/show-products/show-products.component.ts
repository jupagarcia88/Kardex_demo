import { Component, OnInit } from '@angular/core';
import { ProductsService , Product} from '../../services/products.service';

@Component({
  selector: 'app-show-products',
  templateUrl: './show-products.component.html',
  styles: []
})
export class ShowProductsComponent implements OnInit {

  products:Product[] = [];

  constructor(private _productsService:ProductsService) { }

  ngOnInit() {

    this.products = this._productsService.getProducts();

    console.log (this.products);
  }

}
