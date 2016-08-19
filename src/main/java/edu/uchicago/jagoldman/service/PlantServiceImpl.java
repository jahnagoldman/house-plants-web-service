package edu.uchicago.jagoldman.service;

import edu.uchicago.jagoldman.domain.Plant;
import edu.uchicago.jagoldman.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jahnaariellegoldman on 8/16/16.
 */

@Service
public class PlantServiceImpl implements PlantService {

    private PlantRepository plantRepository;

    @Autowired
    public PlantServiceImpl(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @Override
    public Iterable<Plant> list() {
        return plantRepository.findAll();
    }

    @Override
    public Plant create(Plant plant) {
        return plantRepository.save(plant);
    }

    @Override
    public Plant read(long id) {
        return plantRepository.findOne(id);
    }

    @Override
    public Plant update(long id, Plant plant) {
        Plant plantInitial = plantRepository.findOne(id);
        plantInitial.setName(plant.getName());
        plantInitial.setDesc(plant.getDesc());
        plantInitial.setType(plant.getType());
        plantInitial.setImgurl(plant.getImgurl());
        return plantRepository.save(plantInitial);
    }

    @Override
    public void delete(long id) {
        plantRepository.delete(id);

    }
}
