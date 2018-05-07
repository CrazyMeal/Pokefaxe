package crazymeal.fr.pokefaxe;

import java.util.ArrayList;

import crazymeal.fr.pokefaxe.model.Pokemon;
import lombok.Data;

@Data
public final class PokemonManager {

    private static PokemonManager INSTANCE;

    private ArrayList<Pokemon> pokemonList;

    public static PokemonManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PokemonManager();
        }
        return INSTANCE;
    }

    private PokemonManager() {
        this.pokemonList = this.initPokemonList();
    }

    private ArrayList<Pokemon> initPokemonList() {
        ArrayList<Pokemon> initList = new ArrayList<>();
        initList.add(new Pokemon(0, "Floraffe"));
        initList.add(new Pokemon(1, "Girbloom"));
        initList.add(new Pokemon(2, "Lumbraffe"));
        initList.add(new Pokemon(3, "Turtorrid"));
        initList.add(new Pokemon(4, "Turtorch"));
        initList.add(new Pokemon(5, "Briortoise"));
        return  initList;
    }
}
