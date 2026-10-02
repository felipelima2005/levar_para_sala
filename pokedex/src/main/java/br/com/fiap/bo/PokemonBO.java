package br.com.fiap.bo;

import br.com.fiap.dao.PokemonDAO;
import br.com.fiap.to.PokemonTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonBO {
    // Atributo
    private PokemonDAO pokemonDAO;

    // Metodo para regras de negócio
    public ArrayList<PokemonTO> findAll() {
        pokemonDAO = new PokemonDAO();
        // Regras de Negócio...
        return pokemonDAO.findAll();
    }

    public PokemonTO save(PokemonTO pokemom){
        pokemonDAO = new PokemonDAO();
        //aqui se implementa a regra de negocio
        //verificando se o remedio esta vencido
        if (pokemom.getDataDaCaptura().isBefore(LocalDate.now())){
            return null;
        }
        return pokemonDAO.save(pokemom);
    }
}
