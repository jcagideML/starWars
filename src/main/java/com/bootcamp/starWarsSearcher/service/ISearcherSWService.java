package com.bootcamp.starWarsSearcher.service;

import com.bootcamp.starWarsSearcher.model.SearchSWResponseDTO;

public interface ISearcherSWService {

    SearchSWResponseDTO search(String name);
}
