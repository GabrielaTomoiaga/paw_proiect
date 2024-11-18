package org.example.paw_proiect.service;
import org.example.paw_proiect.model.Product;
import org.example.paw_proiect.model.ShoppingCart;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {

    private ShoppingCart shoppingCart = new ShoppingCart();  // Coșul de cumpărături

    public void addProductToCart(Product product) {
        shoppingCart.addProduct(product);  // Metoda care adaugă produsul în coș
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;  // Returnează coșul curent
    }
}