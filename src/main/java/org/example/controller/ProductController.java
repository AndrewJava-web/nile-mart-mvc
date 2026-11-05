package org.example.controller;


import org.example.model.Product;
import org.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    private final  ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public String getAvilableProducts(Model model){
        List<Product> avialbleProducts= productService.getAvilableProducts();
        model.addAttribute("products",avialbleProducts);
        return "products";
    }
}
