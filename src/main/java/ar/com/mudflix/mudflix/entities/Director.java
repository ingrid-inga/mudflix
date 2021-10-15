package ar.com.mudflix.mudflix.entities;

public class Director extends Persona {

    private Pelicula pelicula;

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}
