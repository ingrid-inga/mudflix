package ar.com.mudflix.mudflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.com.mudflix.mudflix.entities.Pelicula;
import ar.com.mudflix.mudflix.repos.PeliculaRepository;

@Service
public class PeliculaService {

    @Autowired
    PeliculaRepository repo;

    public void crearPelicula(Pelicula pelicula) {
        repo.save(pelicula);
    }
}
