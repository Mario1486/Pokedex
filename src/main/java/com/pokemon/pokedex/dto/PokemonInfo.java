
package com.pokemon.pokedex.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("unused")
public class PokemonInfo {

    private List<Ability> abilities;
    @JsonProperty("base_experience")
    private Long baseExperience;
    private List<Form> forms;
    @JsonProperty("game_indices")
    private List<GameIndex> gameIndices;
    private Long height;
    @JsonProperty("held_items")
    private List<Object> heldItems;
    private Long id;
    @JsonProperty("is_default")
    private Boolean isDefault;
    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;
    private List<Move> moves;
    private String name;
    private Long order;
    private Species species;
    private Sprites sprites;
    private List<Stat> stats;
    private List<Type> types;
    private Long weight;

}
