package com.bootcamp.starWarsSearcher.service;

import com.bootcamp.starWarsSearcher.model.SearchSWResponseDTO;
import com.bootcamp.starWarsSearcher.repository.ICharactersNamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearcherSWServiceImpl implements ISearcherSWService {

    @Autowired
    private ICharactersNamesRepository namesRepository;


    @Override
    public SearchSWResponseDTO search(String name) {
        SearchSWResponseDTO result = new SearchSWResponseDTO();
        result.setCharactersNames(namesRepository.searchByName(name));
        return result;
    }
}
