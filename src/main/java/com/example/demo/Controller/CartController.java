package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Cart;
import com.example.demo.service.CartServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class CartController {
    private CartServices cartServices;

    public CartController(CartServices cartServices){
        this.cartServices= cartServices;
    }

    @GetMapping("/products")
    public List<Cart> getAllProducts() {
        Cart[] carts = cartServices.getAllCarts();
        return List.of(carts);
    }

    @GetMapping("/carts")
    public Cart[] getAllCarts() {
        return cartServices.getAllCarts();
    }
    @GetMapping("/carts/{id}")
    public Cart getSingleCart(@PathVariable("id")Long id) {
        return cartServices.getSingleCart(id);
    }

    @PostMapping("/carts")
    public Cart addnewCart(@RequestBody Cart a) {
        return cartServices.addnewCart(a);
    }
}