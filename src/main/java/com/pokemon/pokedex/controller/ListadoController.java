package com.pokemon.pokedex.controller;

import com.pokemon.pokedex.domain.CardPokemon;
import com.pokemon.pokedex.service.PokedexService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author Mario
 */
@Controller
public class ListadoController {
    
    /*
    * Peticiones al Home
    *
    */
    
    private final PokedexService pokedexService;

    public ListadoController(PokedexService pokedexService) {
        this.pokedexService = pokedexService;
    }
    
    
    @RequestMapping("/")
    public String ListarPokedex(Model model){
        List<CardPokemon> buscar = pokedexService.buscarPokemon();
        model.addAttribute("poke", buscar);
        
        
        
        return "home";
        
    }
    
}
