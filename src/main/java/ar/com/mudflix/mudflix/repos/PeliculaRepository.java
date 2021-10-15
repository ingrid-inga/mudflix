package ar.com.mudflix.mudflix.repos;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ar.com.mudflix.mudflix.entities.Pelicula;

@Repository
public interface PeliculaRepository extends MongoRepository <Pelicula,ObjectId> {
    
    
}