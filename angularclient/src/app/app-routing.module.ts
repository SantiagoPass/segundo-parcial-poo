import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LibroListComponent } from './libro-list/libro-list.component';
import { LibroFormComponent } from './libro-form/libro-form.component';

const routes: Routes = [
  { path: 'libros', component: LibroListComponent },
  { path: 'addlibro', component: LibroFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
