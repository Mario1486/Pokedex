
package com.pokemon.pokedex.dto;

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

public class Ability {

    private Ability ability;
    @JsonProperty("is_hidden")
    private Boolean isHidden;
    private String name;
    private Long slot;
    private String url;

}
