import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Libro } from '../model/libro';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class LibroService {

  private librosUrl: string;

  constructor(private http: HttpClient) {
    this.librosUrl = 'http://localhost:8080/libros';
  }

  public findAll(): Observable<Libro[]> {
    return this.http.get<Libro[]>(this.librosUrl);
  }

  public save(libro: Libro) {
    return this.http.post<Libro>(this.librosUrl, libro);
  }
}
