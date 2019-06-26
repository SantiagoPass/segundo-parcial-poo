import { Component, OnInit } from '@angular/core';
import { Libro } from '../model/libro';
import { LibroService } from '../service/libro-service';

@Component({
  selector: 'app-libro-list',
  templateUrl: './libro-list.component.html',
  styleUrls: ['./libro-list.component.css']
})
export class LibroListComponent implements OnInit {

  libros: Libro[];

  constructor(private libroService: LibroService) {
  }

  ngOnInit() {
    this.libroService.findAll().subscribe(data => {
      this.libros = data;
    });
  }
}
