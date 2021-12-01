package co.edu.unbosque.backConsolidacion.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import co.edu.unbosque.backConsolidacion.models.Consolidacion;

@Repository
public interface ConsolidacionDAO extends MongoRepository<Consolidacion, String>{

}
