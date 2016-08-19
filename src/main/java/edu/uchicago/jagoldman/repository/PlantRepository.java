package edu.uchicago.jagoldman.repository;

import edu.uchicago.jagoldman.domain.Plant;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jahnaariellegoldman on 8/16/16.
 */
public interface PlantRepository extends CrudRepository<Plant, Long> {
}
