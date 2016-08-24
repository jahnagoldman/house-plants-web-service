package edu.uchicago.jagoldman.controller;

/**
 * Created by jahnaariellegoldman on 8/18/16.
 */

import edu.uchicago.jagoldman.domain.Plant;
import edu.uchicago.jagoldman.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jahna on 8/20/2016.
 */

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    private PlantService PlantService;

    @Autowired
    public RestController(PlantService PlantService) {
        this.PlantService = PlantService;
    }


    //List is mapped
    //  @RequestMapping( value = "/", method = RequestMethod.POST )
    //  public Post create(@RequestBody Post post){

    //Create is mapped to      @RequestMapping( value = "/", method = RequestMethod.POST )
    //public Post create(@RequestBody Post post){

    //Read is mapped to    @RequestMapping( value = "/", method = RequestMethod.GET )
    //public Post read(@PathVariable(value="id") long id) throws PostNotFoundException {

    //Update is mapped to      @RequestMapping( value = "/{id}", method = RequestMethod.PUT )
    // public Post update(@PathVariable(value="id") long id, @RequestBody Post post){

    //Delete is mapped to      @RequestMapping( value = "/{id}", method = RequestMethod.DELETE )
    // public void delete(@PathVariable(value="id") int id){


    //    //list
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Plant> list() {
        return PlantService.list();
    }

    //create
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Plant create(@RequestBody Plant attr) {
        return PlantService.create(attr);
    }

    //read
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Plant read(@PathVariable(value = "id") long id) {
        Plant post = PlantService.read(id);
        return post;
    }

    //update
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Plant update(@PathVariable(value = "id") long id, @RequestBody Plant attr) {
        return PlantService.update(id, attr);
    }

    //delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") int id) {
        PlantService.delete(id);
    }


}

