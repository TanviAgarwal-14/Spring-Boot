package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.CartDto;
import com.example.demo.models.Cart;

@Service
public class CartServices implements serviceInterface{
    private RestTemplate restTemplate= new RestTemplate();

    @Override
    public Cart[] getAllCarts(){
        ResponseEntity<Cart[]> response = restTemplate.getForEntity("https://fakestoreapi.com/carts",Cart[].class);
        Cart[] allProducts = response.getBody();
        return allProducts;
    }

    @Override
    public Cart getSingleCart(Long id){
        CartDto abc=restTemplate.getForObject("https://fakestoreapi.com/carts" + id, CartDto.class);

        Cart product=new Cart();
        product.setId(abc.getId());
        product.setDate(abc.getDate());
        product.setProducts(abc.getProducts());
        product.setUserId(abc.getUserId());
        return product;
    }
    @Override
    public Cart addnewCart(Cart a){
        CartDto ncart=new CartDto();
        ncart.setDate(a.getDate());
        ncart.setId(a.getId());
        ncart.setProducts(a.getProducts());
        ncart.setUserId(a.getUserId());
        restTemplate.postForObject("https://fakestoreapi.com/carts", ncart, CartDto.class);
        return a;
    }
}
