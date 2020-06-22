
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
public class Stat {

    @JsonProperty("base_stat")
    private Long baseStat;
    private Long effort;
    private String name;
    private Stat stat;
    private String url;

}
