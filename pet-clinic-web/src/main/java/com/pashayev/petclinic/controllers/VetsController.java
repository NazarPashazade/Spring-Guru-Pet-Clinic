package com.pashayev.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetsController {

    @RequestMapping({"", "index","index.html"})
    public String showVets(Model model) {
        model.addAttribute("vets", "Welcome Vets Page");
        return "vets/index";
    }
}
