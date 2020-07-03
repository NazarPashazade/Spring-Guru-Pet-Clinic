package com.pashayev.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {



    @RequestMapping({"", "index","index.html"})
    public String showPets(Model model) {
        model.addAttribute("data", "Welcome Index Page");
        return "index";
    }

}

