package es.etg.prog.pokedex.controller;

import es.etg.prog.pokedex.view.PokedexView;
import lombok.RequiredArgsConstructor;

/**
 * Controlador principal de la aplicación.
 */
@RequiredArgsConstructor
public class PokedexController {

    private final PokedexView vista;

    public void init() {

        boolean salir = false;
        int opcion;

        while (!salir) {

            vista.mostrarMenu();
            opcion = vista.leerEntero();

            switch (opcion) {

                case PokedexView.OPC_MENU_VER -> {
                    System.out.println("Mostrando Pokémon...");
                }

                case PokedexView.OPC_MENU_BUSCAR -> {
                    System.out.println("Buscando Pokémon...");
                }

                case PokedexView.OPC_MENU_SALIR -> {
                    salir = true;
                }

                default -> {
                    System.out.println("Opción no válida");
                }
            }
        }
    }
}
