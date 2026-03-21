package es.etg.prog;

import es.etg.prog.pokedex.controller.PokedexController;
import es.etg.prog.pokedex.view.PokedexView;

public class App {
    public static void main( String[] args ){
    
        PokedexView view = new PokedexView();
        PokedexController controller  = new PokedexController(view);

        controller.init();
    }
}
