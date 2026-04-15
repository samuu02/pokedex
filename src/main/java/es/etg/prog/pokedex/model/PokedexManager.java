package es.etg.prog.pokedex.model;

import es.etg.prog.pokedex.model.entities.Pokemon;

import java.util.List;

public interface PokedexManager {
    
    public void cargar();
    
    public void guardar();
    
    public List<Pokemon> listar();

    public Pokemon obtener(int id);

    public void capturar(int pokemon);
}
