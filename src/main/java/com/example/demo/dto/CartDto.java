package com.example.demo.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartDto {
    private Long id;
    private Long userId;
    private String date;
    private List<Integer> products;
}
