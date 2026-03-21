package es.etg.prog.pokedex.controller;

import es.etg.prog.pokedex.view.PokedexView;

public class PokedexController {
    
    private PokedexView vista;

    public PokedexController(PokedexView vista) {
        this.vista = vista;
    }

    public void init() {
        String opcion;
        do {
            System.out.print(vista.mostrarMenu());
            opcion = vista.leerString();

            switch (opcion) {
                case PokedexView.OPCION_1_VALOR:
                    System.out.println("Has elegido la opción 1.");
                    break;
                case PokedexView.OPCION_2_VALOR:
                    System.out.println("Has elegido la opción 2.");
                    break;
                case PokedexView.SALIR_VALOR:
                    System.out.println("Saliendo del menú..."); 
                    break;
                default:
                    System.out.println("Opción no válida.");
                }
        } while (!opcion.equals(PokedexView.SALIR_VALOR));

    }  
}
