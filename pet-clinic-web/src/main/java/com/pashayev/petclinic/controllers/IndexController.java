package com.pashayev.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "","/index"})
    public String showJoke(Model model) {
        model.addAttribute("pet","Is Working This Page...");
        return "index";
    }

}

