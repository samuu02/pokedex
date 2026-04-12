package es.etg.prog.pokedex.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Pokemon {
    
    private final int id;
    private final String nombre;
    private final String tipo;
    private boolean capturado;
}
