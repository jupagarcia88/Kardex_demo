import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styles: []
})
export class AddProductComponent implements OnInit {

  authUrl:string = 'http://localhost:8080/product';
  producto:any [] = [];

  private products:any =
    {
      "id":"1",
      "name":"producto1",
      "description":"decripcion product 1",
      "house":1,
      "quantity":1
    };

  constructor( private http: HttpClient ) {

    this.http.post<any> (this.authUrl,this.products);
    console.log (this.producto);
// ...
//return this.http.post<any>(this.authUrl, data, {headers: headers});

  }

  ngOnInit() {
  }

  agregarProducto(){
    console.log ("preparado para consumir servicio "+this.authUrl);

    /*const data = new FormData();
    data.append("id", "1");
    data.append("name", "producto 1");
    data.append("description", "descripcion product 1");
    data.append("house", "1");
    data.append("quantity", "1");
// ...
//return this.http.post<any>(this.authUrl, data, {headers: headers});
    this.http.post<any> (this.authUrl,this.products);*/
    console.log (this.producto);
  }

}
