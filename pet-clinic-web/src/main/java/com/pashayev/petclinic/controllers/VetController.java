package com.pashayev.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index","/vets/index.html"})
    public String showVets(Model model) {
        model.addAttribute("vets", "Welcome Vets Page");
        return "vets/index";
    }
}
