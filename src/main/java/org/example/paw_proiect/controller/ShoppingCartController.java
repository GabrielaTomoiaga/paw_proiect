package org.example.paw_proiect.controller;

import org.example.paw_proiect.model.Product;
import org.example.paw_proiect.model.ShoppingCart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShoppingCartController {

    private ShoppingCart shoppingCart = new ShoppingCart();

    @PostMapping("/add-to-cart")
    public String addToCart(@RequestParam("productId") int productId, Model model) {


        Product product = new Product(productId, "Produs Exemplu", "100", "image.jpg");
        shoppingCart.addProduct(product);
        model.addAttribute("shoppingCart", shoppingCart);
        return "redirect:/cosul_meu";  // Redirecționează la pagina de coș
    }

    @GetMapping("/cosul_meu")
    public String viewCart(Model model) {
        model.addAttribute("shoppingCart", shoppingCart);
        return "cosul_meu";  // Aceasta este pagina unde afișezi coșul
    }
}