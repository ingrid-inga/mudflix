package ar.com.mudflix.mudflix.controllers;

import java.util.*;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ar.com.mudflix.mudflix.entities.*;
import ar.com.mudflix.mudflix.models.response.GenericResponse;
import ar.com.mudflix.mudflix.services.SerieService;

@RestController
public class SerieController {

    @Autowired
    SerieService serieService;

    @GetMapping( "/api/series")
    public ResponseEntity<List<Serie>> getSeries() {

        List<Serie> series = serieService.traerSeries();

        return ResponseEntity.ok(series);

    }

    @PostMapping("/api/series")
    public ResponseEntity<?> crearSerie(@RequestBody Serie serie) {
        
        GenericResponse r = new GenericResponse();
        serieService.crearSerie(serie);
        r.id = serie.get_id().toHexString();
        r.isOk = true;
        r.message = "Serie creada con exito";
        return ResponseEntity.ok(r);
    }
    

    
    @GetMapping( "/api/series/{serieId}/temporada/{numeroTemporada}/episodio/{numeroEpisodio}")
    public ResponseEntity<Episodio> getSeries(@PathVariable ObjectId serieId, @PathVariable Integer numeroTemporada, @PathVariable Integer numeroEpisodio) {

        Episodio episodio = serieService.buscarEpisodio(serieId, numeroTemporada, numeroEpisodio);

        return ResponseEntity.ok(episodio);

    }
}