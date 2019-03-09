package com.greenfoxacademy.saturday.controller;

import com.greenfoxacademy.saturday.model.Gender;
import com.greenfoxacademy.saturday.model.Inhabitant;
import com.greenfoxacademy.saturday.model.InhabitantList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class InhabitantController {

    private InhabitantList inhabitants;

    @Autowired
    public InhabitantController(InhabitantList inhabitants){
       this.inhabitants = inhabitants;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String mainPage(){
        return "index";
    }

    @RequestMapping(path = "/inhabitants", method = RequestMethod.GET)
    public String showInhabitants(Model model){
        model.addAttribute("inhabitants", inhabitants.getInhabitants());
        return "inhabitant_table";
    }

    @RequestMapping(path = "/inhabitants/{id}", method = RequestMethod.GET)
    public String filterInhabitants(Model model, @PathVariable int id){
        Inhabitant inhabitant = inhabitants.filterByID(id);
        if (inhabitant != null) {
            model.addAttribute("filteredInhabitant", inhabitant);
        } else {
            model.addAttribute("error", "No inhabitant found with this ID");
        }
        return "inhabitant_id";
    }

    @GetMapping(path = "/inhabitants/add")
    public String addInhabitant(Model model){
        model.addAttribute("inhabitant", new Inhabitant());
        model.addAttribute("genders", Gender.values());
        return "inhabitant_add";
    }

    @PostMapping(path = "/inhabitants/add")
    public String addInhabitantSent(Inhabitant inhabitant){
        inhabitants.addInhabitant(inhabitant);
        return "redirect:/inhabitants";
    }
}
