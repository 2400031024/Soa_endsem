package com.example.ms1add.controller;

import com.example.ms1add.dto.AddResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

@GetMapping("/ms1/add")
public int add(
    @RequestParam(required = false) Integer a,
    @RequestParam(required = false) Integer b) {

    if (a == null)
        return b;

    if (b == null)
        return a;

    return a + b;
}
}