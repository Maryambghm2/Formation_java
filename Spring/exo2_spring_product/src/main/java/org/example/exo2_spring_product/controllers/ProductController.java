package org.example.exo2_spring_product.controllers;

import org.example.exo2_spring_product.services.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
        private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;

        // Création produits;
        productService.create("MacBook Pro", "Informatique", 2200.00);
        productService.create("iPhone 13", "Téléphonie", 999.99);
        productService.create("Clavier Logitech", "Informatique", 49.99);
        productService.create("Chaise Gaming", "Mobilier", 199.90);
        productService.create("Samsung Galaxy S22", "Téléphonie", 899.99);
        productService.create("Table de bureau", "Mobilier", 159.99);
        productService.create("Écran 4K", "Informatique", 349.99);
        productService.create("Aspirateur Dyson", "Électroménager", 449.00);
        productService.create("Lampe de chevet", "Mobilier", 29.99);
        productService.create("Casque Bluetooth", "Audio", 89.90);
    }







}
