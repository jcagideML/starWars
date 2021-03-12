package com.bootcamp.starWarsSearcher.repository;

import com.bootcamp.starWarsSearcher.model.CharacterDTO;

import java.util.List;

public interface ICharactersNamesRepository {

    List<CharacterDTO> searchByName(String name);
}
