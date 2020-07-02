package com.pashayev.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pets/")
public class PetsController {

    @RequestMapping({"", "index","index.html"})
    public String showPets(Model model) {
        model.addAttribute("pets", "Welcome Pets Page");
        return "pets/index";
    }

}
