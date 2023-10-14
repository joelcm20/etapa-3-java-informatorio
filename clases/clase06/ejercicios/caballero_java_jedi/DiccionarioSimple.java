package ejercicios.caballero_java_jedi;

import java.util.HashMap;
import java.util.Scanner;

public class DiccionarioSimple {
    Diccionario diccionario;

    public static void main(String[] args) {
        DiccionarioSimple instancia = new DiccionarioSimple();
        instancia.diccionario = new Diccionario();
        Scanner input = new Scanner(System.in);

        boolean continuarEjecutando;
        do {
            instancia.mostrarMenu();
            continuarEjecutando = instancia.ejecutarOpcion(input);
        } while (continuarEjecutando);

        input.close();
    }

    public void mostrarMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("[----------DICCIONARIO----------]\n");
        menu.append("1. Listar definiciones de palabras.\n");
        menu.append("2. Agregar palabra.\n");
        menu.append("3. Buscar palabra.\n");
        menu.append("0. Salir.\n");
        System.out.println(menu);
    }

    public boolean ejecutarOpcion(Scanner input) {
        System.out.print("selecciona numero de opcion >> ");
        String opcion = input.nextLine();

        boolean continuarEjecutando = Boolean.TRUE;
        switch (opcion) {
            case "1":
                this.listarPalabras();
                break;
            case "2":
                this.agregarPalabra(input);
                break;
            case "3":
                this.buscarPalabra(input);
                break;
            case "0":
                continuarEjecutando = Boolean.FALSE;
                break;
            default:
                System.out.println("opcion invalida.\n");
                ejecutarOpcion(input);
                break;
        }
        return continuarEjecutando;
    }

    private void listarPalabras() {
        if (this.diccionario.getPalabras().isEmpty()) {
            System.out.println("Diccionario vacio.\n");
            return;
        }
        StringBuilder listaPalabras = new StringBuilder();
        for (String palabra : this.diccionario.getPalabras().keySet()) {
            listaPalabras.append(String.format("- %s: %s.\n", palabra, this.diccionario.getPalabras().get(palabra)));
        }
        System.out.printf("%s\n\n", listaPalabras);
    }

    private void agregarPalabra(Scanner input) {
        System.out.print("escribir palabra >> ");
        String palabraNueva = input.nextLine();
        System.out.print("definicion de la palabra >> ");
        String definicion = input.nextLine();

        Palabra palabra = new Palabra(palabraNueva, definicion);
        this.diccionario.agregarPalabra(palabra);
        System.out.printf("palabra %s agregada.\n\n", palabraNueva);
    }

    private void buscarPalabra(Scanner input) {
        System.out.print("escribir palabra >> ");
        String palabraBuscar = input.nextLine();

        StringBuilder listaPalabras = new StringBuilder();
        for (String palabra : this.diccionario.getPalabras().keySet()) {
            if (palabra.contains(palabraBuscar)) {
                listaPalabras.append(String.format("- %s: %s.\n", palabra, this.diccionario.getPalabras().get(palabra)));
            }
        }
        if (listaPalabras.isEmpty()) {
            System.out.printf("No hay resultados para \"%s\".\n\n", palabraBuscar);
        } else {
            System.out.printf("%s\n\n", listaPalabras);
        }
    }
}

class Palabra {
    private String nombre;
    private String definicion;

    public Palabra() {
    }

    public Palabra(String nombre, String definicion) {
        this.nombre = nombre;
        this.definicion = definicion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }
}

class Diccionario {
    private String nombre;
    private HashMap<String, String> palabras = new HashMap<>();

    public Diccionario() {
    }

    public Diccionario(String nombre, HashMap<String, String> palabras) {
        this.nombre = nombre;
        this.palabras = palabras;
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<String, String> getPalabras() {
        return palabras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPalabra(Palabra palabra) {
        this.palabras.put(palabra.getNombre(), palabra.getDefinicion());
    }
}