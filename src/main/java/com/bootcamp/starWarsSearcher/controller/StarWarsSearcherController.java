package com.bootcamp.starWarsSearcher.controller;


import com.bootcamp.starWarsSearcher.model.SearchSWResponseDTO;
import com.bootcamp.starWarsSearcher.service.ISearcherSWService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarWarsSearcherController {

    @Autowired
    private ISearcherSWService service;

    @PostMapping("/search")
    public SearchSWResponseDTO search(@RequestBody String name) {

        return service.search(name);
    }
}
