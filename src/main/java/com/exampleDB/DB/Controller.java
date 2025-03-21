package com.exampleDB.DB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class Controller {
    private Service service;

    @GetMapping("/fetch-product")
    public List<String> getProductName(@RequestParam(value = "name", required = false) String name) {
        return service.getProductName(name);
    }
}
