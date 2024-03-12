package com.example.demo.service;

import com.example.demo.models.Cart;

public interface serviceInterface {
    Cart[] getAllCarts();

    Cart getSingleCart(Long id);

    Cart addnewCart(Cart a);
}
