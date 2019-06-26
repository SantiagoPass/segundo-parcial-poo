import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LibroService } from '../service/libro-service';
import { Libro } from '../model/libro';

@Component({
  selector: 'app-libro-form',
  templateUrl: './libro-form.component.html',
  styleUrls: ['./libro-form.component.css']
})
export class LibroFormComponent {

  libro: Libro;

  constructor(private route: ActivatedRoute, private router: Router, private libroService: LibroService) {
    this.libro = new Libro();
  }

  onSubmit() {
    this.libroService.save(this.libro).subscribe(result => this.gotoLibroList());
  }

  gotoLibroList() {
    this.router.navigate(['/libros']);
  }
}
