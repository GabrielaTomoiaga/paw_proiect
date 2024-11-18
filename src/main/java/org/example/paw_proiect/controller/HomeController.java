package org.example.paw_proiect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/bijuterii")
    public String bijuterii() {
        return "bijuterii";
    }

    @GetMapping("/cos")
    public String cos() {
        return "cos";
    }

    @GetMapping("/cont")
    public String cont() {
        return "cont";
    }
}


