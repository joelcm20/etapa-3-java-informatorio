package ejercicios.padawan_java_jedi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstudianteYCalificaciones {
    List<Estudiante> estudiantes = new ArrayList<>();

    public static void main(String[] args) {
        EstudianteYCalificaciones instancia = new EstudianteYCalificaciones();
        Scanner input = new Scanner(System.in);

        boolean continuarEjecucion;
        do {
            instancia.mostrarMenu();
            continuarEjecucion = instancia.ejecutarOpcion(input);
        } while (continuarEjecucion);

        input.close();
    }

    public void mostrarMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("[----------APP ESTUDIANTES Y CALIFICACIONES----------]\n");
        menu.append("1. Listar Estudiantes.\n");
        menu.append("2. Agregar Estudiante.\n");
        menu.append("0. Salir.\n");
        System.out.println(menu);
    }

    public boolean ejecutarOpcion(Scanner input) {
        boolean continuarEjecucion = Boolean.TRUE;
        System.out.print("selecciona el numero de opcion >> ");
        String opcion = input.nextLine();

        switch (opcion) {
            case "1":
                this.listarEstudiantes();
                break;
            case "2":
                this.crearEstudiante(input);
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

    private void listarEstudiantes() {
        if (this.estudiantes.isEmpty()) {
            System.out.println("Sin estudiantes.\n");
        } else {
            StringBuilder listaEstudiantes = new StringBuilder();

            for (Estudiante e : this.estudiantes) {
                listaEstudiantes.append(String.format("ID[%S] %s | %s.\n", e.id, e.nombre, e.calcPromCalif()));
            }

            System.out.println(listaEstudiantes);
        }
    }

    private void crearEstudiante(Scanner input) {
        Estudiante estudiante = new Estudiante();
        estudiante.id = this.estudiantes.size();
        System.out.print("nombre >> ");
        estudiante.nombre = input.nextLine();
        boolean ok = agregarEstudiante(estudiante);
        if (ok) {
            System.out.printf("Estudiante %s agregado.\n\n", estudiante.nombre);
        } else {
            System.out.println("No fue posible agregar el estudiante.\n");
        }
    }

    private boolean agregarEstudiante(Estudiante e) {
        return this.estudiantes.add(e);
    }
}

class Estudiante {
    int id;
    String nombre;
    List<Calificacion> calificaciones = new ArrayList<>();

    public float calcPromCalif() {
        if (this.calificaciones.isEmpty()) {
            return 0;
        }

        float sumaCalificaciones = 0;
        for (Calificacion c : this.calificaciones) {
            sumaCalificaciones = sumaCalificaciones + c.numero;
        }
        return sumaCalificaciones / this.calificaciones.size();
    }
}

class Calificacion {
    float numero;
    LocalDate fecha;
}
