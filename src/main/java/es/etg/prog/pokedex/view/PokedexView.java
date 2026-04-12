package es.etg.prog.pokedex.view;

import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario.
 */

public class PokedexView {
    
    public static final int OPC_MENU_VER = 1;
    public static final int OPC_MENU_BUSCAR = 2;
    public static final int OPC_MENU_SALIR = 0;

    private static final String MENU =
            "===== POKEDEX =====%n" +
            "%d. Ver Pokémon%n" +
            "%d. Buscar Pokémon%n" +
            "%d. Salir%n" +
            "Selecciona una opción: ";

    private final Scanner scanner;

    public PokedexView() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.print(String.format(
                MENU,
                OPC_MENU_VER,
                OPC_MENU_BUSCAR,
                OPC_MENU_SALIR
        ));
    }

    public String leerString() {
        return scanner.nextLine();
    }

    public int leerEntero() {
        return Integer.parseInt(leerString());
    }
}
