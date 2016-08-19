package edu.uchicago.jagoldman.service;

import edu.uchicago.jagoldman.domain.Plant;

/**
 * Created by jahnaariellegoldman on 8/16/16.
 */
public interface VanService {

    //list + CRUD

    Iterable<Plant> list();

    Plant create(Plant plant);

    Plant read(long id);

    Plant update(long id, Plant plant);

    void delete(long id);
}
