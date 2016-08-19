package edu.uchicago.jagoldman.service;

import edu.uchicago.jagoldman.domain.Plant;
import edu.uchicago.jagoldman.repository.VanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jahnaariellegoldman on 8/16/16.
 */

@Service
public class VanServiceImpl implements VanService{

    private VanRepository vanRepository;

    @Autowired
    public VanServiceImpl(VanRepository vanRepository) {
        this.vanRepository = vanRepository;
    }

    @Override
    public Iterable<Plant> list() {
        return vanRepository.findAll();
    }

    @Override
    public Plant create(Plant plant) {
        return vanRepository.save(plant);
    }

    @Override
    public Plant read(long id) {
        return vanRepository.findOne(id);
    }

    @Override
    public Plant update(long id, Plant plant) {
        Plant plantInitial = vanRepository.findOne(id);
        plantInitial.setName(plant.getName());
        plantInitial.setDesc(plant.getDesc());
        plantInitial.setType(plant.getType());
        plantInitial.setImgurl(plant.getImgurl());
        return vanRepository.save(plantInitial);
    }

    @Override
    public void delete(long id) {
        vanRepository.delete(id);

    }
}
