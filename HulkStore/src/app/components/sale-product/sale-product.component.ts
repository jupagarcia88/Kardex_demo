import { Component, OnInit } from '@angular/core';
import { ProductsService , Product} from '../../services/products.service';

@Component({
  selector: 'app-sale-product',
  templateUrl: './sale-product.component.html',
  styles: []
})
export class SaleProductComponent implements OnInit {
  products:Product[] = [];
  constructor( private _productsService:ProductsService ) { }

  ngOnInit() {

    this.products = this._productsService.getProducts();

    console.log (this.products);

  }
  /*capturar() {
        // Pasamos el valor seleccionado a la variable verSeleccion
        this.verSeleccion = this.opcionSeleccionado;
    }*/

}
