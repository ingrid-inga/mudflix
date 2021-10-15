package ar.com.mudflix.mudflix.repos;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ar.com.mudflix.mudflix.entities.Serie;


@Repository
public interface SerieRepository extends MongoRepository <Serie,ObjectId> {
    Serie findBy_id(ObjectId id);
}
