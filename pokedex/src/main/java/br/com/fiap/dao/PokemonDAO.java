package br.com.fiap.dao;

import br.com.fiap.to.PokemonTO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonDAO {
    // Mock SELECT
    public ArrayList<PokemonTO> findAll() {
        // Lista
        ArrayList<PokemonTO> pokemons = new ArrayList<>();
        // Objeto
        PokemonTO pokemon = new PokemonTO();

        // preenchimento
        pokemon = new PokemonTO(1L, "Pikachu", 1.50, 100.0, "Raio", LocalDate.now());
        // Novo pokemon na lista
        pokemons.add(pokemon);

        // preenchimento
        pokemon = new PokemonTO(2L, "Mewtwo", 1.90, 150.0, "Psíquico", LocalDate.now());
        // Novo pokemon na lista
        pokemons.add(pokemon);

        // preenchimento
        pokemon = new PokemonTO(3L, "Charizard", 3.0, 500.0, "Fogo", LocalDate.now());
        // Novo pokemon na lista
        pokemons.add(pokemon);

        return pokemons;
    }

    public PokemonTO save(PokemonTO pokemom) {
        String sql = "insert into pokemom(nome,,altura,peso,categoria,dataCaptura) values(?,?,?,?,?)";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {

            ps.setString(1, pokemom.getNome());
            ps.setDouble(2, pokemom.getAltura());
            ps.setDouble(3, pokemom.getPeso());
            ps.setString(4, pokemom.getCategoria());
            ps.setDate(5, Date.valueOf(pokemom.getDataDaCaptura()));
            if (ps.executeUpdate() > 0) {
                return pokemom;
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return null;
    }
}
