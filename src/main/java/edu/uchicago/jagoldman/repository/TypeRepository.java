package edu.uchicago.jagoldman.repository;

import edu.uchicago.jagoldman.domain.Type;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jahnaariellegoldman on 8/16/16.
 */
public interface MakeRepository extends CrudRepository<Type, Long> {
}
