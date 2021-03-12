package com.bootcamp.starWarsSearcher.model;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchSWResponseDTO {
    private List<CharacterDTO> charactersNames;
}
