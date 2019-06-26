package main.java.entyties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreLibro;
    private String nombreAutor;
    private int anoEdicion;


    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nombreLibro='" + nombreLibro + '\'' +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", anoEdicion='" + anoEdicion + '\'' +
                '}';
    }

    public Libro() {
    }

    // standard constructors / setters / getters / toString
    public Libro(String nombreLibro, String nombreAutor, int anoEdicion) {
        this.nombreLibro = nombreLibro;
        this.nombreAutor = nombreAutor;
        this.anoEdicion = anoEdicion;
    }

    public int getAnoEdicion() {
        return anoEdicion;
    }

    public void setAnoEdicion(int anoEdicion) {
        this.anoEdicion = anoEdicion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
}
