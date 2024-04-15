package animal.repository;

import animal.entity.Animals;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animals,Long> {
    List<Animals> findAnimalsByName(String name);
}
