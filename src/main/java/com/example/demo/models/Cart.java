package com.example.demo.models;

// import java.lang.reflect.Array;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart {
    private Long id;
    private Long userId;
    private String date;
    private List<Integer> products;
}

// private String title;
    // private String description;
    // private double price;
    // private String category;
    // private String imageUrl;