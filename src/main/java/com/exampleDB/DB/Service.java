package com.exampleDB.DB;


import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private Repository repository;

    protected List<String> getProductName(String name) {
        return repository.getProductName(name);
    }
}
