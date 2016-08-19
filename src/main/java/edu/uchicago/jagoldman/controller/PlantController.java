package edu.uchicago.jagoldman.controller;

import edu.uchicago.jagoldman.domain.Van;
import edu.uchicago.jagoldman.service.VanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jahnaariellegoldman on 8/16/16.
 */

@Controller
public class VanController {

    private VanService vanService;

    @Autowired
    public VanController(VanService vanService) {
        this.vanService = vanService;
    }

    //List + CRUD

    //list get

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("vans", vanService.list());
        return "vanlist";
    }


    //create post

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Van create(@RequestBody Van van) {
        return vanService.create(van);

    }


    //read get

    @RequestMapping(value = "/(id)", method = RequestMethod.GET)
    public Van read(@PathVariable(value = "id") long id) {
        Van post = vanService.read(id);
        return post;

    }

    //update put

    @RequestMapping(value = "/(id)", method = RequestMethod.PUT)
    public Van update(@PathVariable(value = "id") long id, @RequestBody Van van) {
        Van post = vanService.update(id, van);
        return post;

    }

    // delete delete
    @RequestMapping(value = "/(id)", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") long id) {
        vanService.delete(id);
    }


}
