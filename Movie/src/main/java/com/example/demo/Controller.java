package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList.*;
@org.springframework.stereotype.Controller
public class Controller {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MovieService movieService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("movies", movieService.findAll());
        return "index";
    }
    @GetMapping("/Create")
    public String create(Model model){
        //log.info("Create action called...");
        model.addAttribute("Movie", new Movie());

        return "create";
    }

    @PostMapping("/Create")
    public String create(@ModelAttribute Movie movie, Model model) {
        //log.info("Create action called...");
        return "redirect:/";
    }
        /*MovieServ.save(movie);
        MovieService.addAttribute("Movies", MovieServ.fetchAll());*/

        //return "redirect:/"
}



