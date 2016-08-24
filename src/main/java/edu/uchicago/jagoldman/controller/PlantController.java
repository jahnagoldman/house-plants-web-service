package edu.uchicago.jagoldman.controller;

import edu.uchicago.jagoldman.domain.Plant;
import edu.uchicago.jagoldman.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jahnaariellegoldman on 8/16/16.
 */

@Controller
public class PlantController {

    private PlantService plantService;

    @Autowired
    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    //List + CRUD

    //list get

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("plants", plantService.list());
        return "plantlist";
    }

    @RequestMapping(value = "/more")
    public String getMore() {
        return "more";
    }


    //create post

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Plant create(@RequestBody Plant plant) {
        return plantService.create(plant);

    }


    //read get

    @RequestMapping(value = "/(id)", method = RequestMethod.GET)
    public Plant read(@PathVariable(value = "id") long id) {
        Plant post = plantService.read(id);
        return post;

    }

    //update put

    @RequestMapping(value = "/(id)", method = RequestMethod.PUT)
    public Plant update(@PathVariable(value = "id") long id, @RequestBody Plant plant) {
        Plant post = plantService.update(id, plant);
        return post;

    }

    // delete delete
    @RequestMapping(value = "/(id)", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        plantService.delete(id);
    }


}
