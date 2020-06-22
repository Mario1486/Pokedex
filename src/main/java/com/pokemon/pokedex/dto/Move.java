
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
public class Move {

    private Move move;
    private String name;
    private String url;
    @JsonProperty("version_group_details")
    private List<VersionGroupDetail> versionGroupDetails;

}
