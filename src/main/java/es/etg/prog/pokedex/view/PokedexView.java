package es.etg.prog.pokedex.view;
import java.util.Scanner;

public class PokedexView {

    private Scanner scanner;
    
    public static final String MENU_TITULO = "====POKEDEX====";
    public static final String OPCION_1 = "1. Ver pokemon.";
    public static final String OPCION_2 = "2. Buscar pokemon.";
    public static final String OPCION_SALIR = "0. Salir.";
    public static final String PEDIR_OPCION = "Elige una opción: ";

    public static final String OPCION_1_VALOR = "1";
    public static final String OPCION_2_VALOR = "2";
    public static final String SALIR_VALOR = "0";
    
    public PokedexView() {
        this.scanner = new Scanner(System.in);
    }

    public String mostrarMenu() {
        return MENU_TITULO + "\n" +
        OPCION_1 + "\n" +
        OPCION_2 + "\n" +
        OPCION_SALIR + "\n" +
        PEDIR_OPCION;
    }

    public String leerString() {
        return scanner.nextLine();
    }

    public int leerEntero() {
        int entero = scanner.nextInt();
        return entero;
    }
}
