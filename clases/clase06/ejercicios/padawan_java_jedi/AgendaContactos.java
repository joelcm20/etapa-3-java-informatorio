package ejercicios.padawan_java_jedi;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AgendaContactos {
    List<Contacto> contactos = new LinkedList<>();

    public static void main(String[] args) {
        AgendaContactos instancia = new AgendaContactos();
        Scanner input = new Scanner(System.in);

        System.out.println("[----------APP AGENDA DE CONTACTOS----------]");

        boolean continuearEjecucion;
        do {
            instancia.mostrarMenu();
            continuearEjecucion = instancia.ejecutarOpcion(input);
        } while (continuearEjecucion);

        input.close();
    }


    public void mostrarMenu() {
        String menu = "1. Listar Contactos.\n2. Agregar Contacto.\n3. Buscar Contacto.\n4. Eliminar Contacto.\n0. Salir.";
        System.out.println(menu);
    }

    public boolean ejecutarOpcion(Scanner input) {
        System.out.print("seleccionar numero de opcion >> ");
        String opcion = input.nextLine();
        boolean continuarEjecucion = Boolean.TRUE;

        switch (opcion) {
            case "1":
                this.listarContactos();
                break;
            case "2":
                this.crearContacto(input);
                break;
            case "3":
                this.buscarContacto(input);
                break;
            case "4":
                this.eliminarContacto(input);
                break;
            case "0":
                continuarEjecucion = Boolean.FALSE;
                break;
            default:
                System.out.println("opcion invalida.");
                ejecutarOpcion(input);
                break;
        }

        return continuarEjecucion;
    }

    private void listarContactos() {
        if (this.contactos.isEmpty()) {
            System.out.println("No hay contactos.");
        } else {
            StringBuilder contactos = new StringBuilder();
            for (Contacto c : this.contactos) {
                contactos.append(String.format("-ID[%s] %s Nº %s - %s\n", c.id, c.nombre, c.telefono, c.correo));
            }
            System.out.println(contactos);
        }
    }

    private void crearContacto(Scanner input) {
        Contacto contacto = new Contacto();
        contacto.id = this.contactos.size();

        System.out.print("Nombre >> ");
        contacto.nombre = input.nextLine();
        System.out.print("Telefono >> ");
        contacto.telefono = input.nextLine();
        System.out.print("Correo >> ");
        contacto.correo = input.nextLine();

        this.agregarContacto(contacto);
    }

    private void agregarContacto(Contacto c) {
        this.contactos.add(c);
    }

    private void eliminarContacto(Scanner input) {
        System.out.print("ingresar id del contacto >> ");
        int idContacto = Integer.parseInt(input.nextLine());
        boolean ok = this.contactos.removeIf(contacto -> contacto.id == idContacto);
        if (ok) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("Error al eliminar contacto.");
        }
    }

    private void buscarContacto(Scanner input) {
        System.out.print("ingresa un nombre >> ");
        String nombreContacto = input.nextLine();

        StringBuilder contactos = new StringBuilder();
        for (Contacto c : this.contactos) {
            if (c.nombre.contains(nombreContacto)) {
                contactos.append(String.format("-ID[%s] %s Nº %s - %s\n", c.id, c.nombre, c.telefono, c.correo));
            }
        }
        System.out.println(contactos);
    }
}

class Contacto {
    String nombre;
    String telefono;
    String correo;
    int id;

    public Contacto() {
    }

    public Contacto(String nombre, String telefono, String correo, int id) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.id = id;
    }
}