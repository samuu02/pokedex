package es.etg.prog.pokedex.model.entities;

import java.util.List;

import es.etg.prog.pokedex.model.PokedexManager;
import es.etg.prog.pokedex.model.persistence.IPokemonRepository;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data @AllArgsConstructor
public class Pokedex implements PokedexManager {
    

    private IPokemonRepository repository;

    @Override
    public void cargar() {
        // No hace nada, el repository se encarga
    }

    @Override
    public void guardar() {
        // Tampoco hace nada sin parámetros
    }

    @Override
    public List<Pokemon> listar() {
        return repository.cargar(); 
    }

    @Override
    public Pokemon obtener(int id) {
        for (Pokemon p : repository.cargar()) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void capturar(int pokemonId) {
        List<Pokemon> lista = repository.cargar();

        for (Pokemon p : lista) {
            if (p.getId() == pokemonId) {
                p.setCapturado(true);
            }
        }

        repository.guardar(lista); 
    }
}