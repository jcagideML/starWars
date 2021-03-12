package com.bootcamp.starWarsSearcher.repository;

import com.bootcamp.starWarsSearcher.model.CharacterDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Repository
public class CharactersNamesRepositoryImpl implements ICharactersNamesRepository {

    List<CharacterDTO> charactersNames;

    public CharactersNamesRepositoryImpl() {
        this.charactersNames = loadFromDB();
    }

    @Override
    public List<CharacterDTO> searchByName(String name) {

        return charactersNames.stream().
                filter(value -> value.getName().toLowerCase()
                        .contains(name.toLowerCase())).
                collect(Collectors.toList());
    }

    private List<CharacterDTO> loadFromDB() {

        List<CharacterDTO> result = null;

        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<CharacterDTO>> typeRef = new TypeReference<List<CharacterDTO>>() {
        };

        try {
            result = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}