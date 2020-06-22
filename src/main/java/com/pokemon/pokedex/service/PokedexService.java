package com.pokemon.pokedex.service;

import com.pokemon.pokedex.domain.CardPokemon;
import com.pokemon.pokedex.dto.PokemonInfo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Mario
 */
@Service
public class PokedexService {
//https://pokeapi.co/api/v2/pokemon

    static final String URL_LIST_POKEMON = "https://pokeapi.co/api/v2/pokemon/";
    static final String URL_IMG_POKEMON = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/";
    static final String EXT_IMG_POKEMON = ".png";

    public List<CardPokemon> buscarPokemon() {

        int i = 2;
        String cadena = "";
        List<CardPokemon> buscar = new ArrayList();
        CardPokemon pokemon = new CardPokemon();
        CardPokemon infoPoke = new CardPokemon();

        //LLamado a la API
        RestTemplate restTemplate = new RestTemplate();
        PokemonInfo result2 = restTemplate.getForObject(URL_LIST_POKEMON + i, PokemonInfo.class);

         //System.out.println(result2.getTypes().get(0).getType().getName());
        //System.out.println(result2.getTypes().get(1).getType().getName());

        //System.out.println(result2.getTypes().get(1).getType().getName());
        for (int j = 1; j < 21; j++) {
            PokemonInfo result = restTemplate.getForObject(URL_LIST_POKEMON + j, PokemonInfo.class);
            pokemon = new CardPokemon();
            pokemon.setNombre(result.getName());
            pokemon.setPeso(result.getWeight());
            pokemon.setUrl(URL_IMG_POKEMON + j + EXT_IMG_POKEMON);
            
            if (result.getTypes().size() > 1) {
                for (int h = 0; h < result.getTypes().size(); h++) {
                    //System.out.println(result.getTypes().get(h).getType().getName());
                    cadena = cadena + "-" + result.getTypes().get(h).getType().getName();
                    //System.out.println(cadena);
                }
                pokemon.setTipo(cadena);
                cadena = "";
            }
            else{
                pokemon.setTipo(result.getTypes().get(0).getType().getName());
            }
            
            buscar.add(pokemon);
        }

        return buscar;

    }

}
