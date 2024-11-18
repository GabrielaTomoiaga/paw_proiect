package org.example.paw_proiect.controller;

import org.example.paw_proiect.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BijuteriiController {

    @GetMapping("/bijuterii/{categorie}")
    public String getBijuteriiByCategorie(@PathVariable String categorie, Model model) {
        List<Product> produse = new ArrayList<>();
        switch (categorie.toLowerCase()) {
            case "inele":
                produse.add(new Product(1, "Inel de argint", "150 RON", "/images/img9.png"));
                produse.add(new Product(2, "Inel cu de aur", "500 RON", "/images/img10.jpg"));
                break;
            case "lantisoare":
                produse.add(new Product(3, "Lanț de Aur", "400 RON", "/images/img2.jpg"));
                produse.add(new Product(4, "Lanț de aur cu pandantiv", "350 RON", "/images/img4.jpg"));
                break;
            case "bratari":
                produse.add(new Product(5, "Brățară de aur", "250 RON", "/images/img14.jpg"));
                produse.add(new Product(6, "Brățară de aur cu pandantive", "400 RON", "/images/img13.jpg"));
                break;
            case "cercei":
                produse.add(new Product(7, "Cercei de aur", "280 RON", "/images/img7.png"));
                produse.add(new Product(8, "Cercei cu pietre grena", "350 RON", "/images/img6.jpg"));
                break;
            default:
                model.addAttribute("error", "Categorie necunoscută!");
                return "error";
        }
        model.addAttribute("produse", produse);
        model.addAttribute("categorie", categorie);
        return "category";
    }

}
