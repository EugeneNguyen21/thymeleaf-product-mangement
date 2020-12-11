package controllers;

import entities.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.ProductService;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService = new ProductService();
    @GetMapping("/")
    public String index(Model model){
        List<Product> productList;
        productList = productService.findAll();
        model.addAttribute("productList", productList);
        return "/index";
    }
    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

}
