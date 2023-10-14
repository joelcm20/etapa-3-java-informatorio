package ejercicios.padawan_java_jedi;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
        menu.append("3. Agregar Calificacion.\n");
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
            case "3":
                this.crearCalificacion(input);
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
                listaEstudiantes.append(String.format("ID[%S] %s | %s.\n", e.id, e.nombre, this.floatFormat(e.calcPromCalif())));
            }

            System.out.println(listaEstudiantes);
        }
    }

    private String floatFormat(float f) {
        DecimalFormat decFormat = new DecimalFormat("#.#");
        return decFormat.format(f);
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

    private void crearCalificacion(Scanner input) {
        System.out.print("ID del estudiante >> ");
        int idEstudiante = Integer.parseInt(input.nextLine());

        final Estudiante ESTUDIANTE = this.buscarEstudiante(idEstudiante);
        if (ESTUDIANTE == null) {
            System.out.println("Estudiante no encontrado.\n\n");
            return;
        }

        boolean otraCalificacion = Boolean.FALSE;
        do {
            System.out.printf("numero de la calificacion >> ");
            Calificacion calificacion = new Calificacion(Float.parseFloat(input.nextLine()));

            ESTUDIANTE.agregarCalificacion(calificacion);

            System.out.printf("¿agregar otra calificacion? Presionar 1(si). Enter(no) >> ");
            otraCalificacion = Objects.equals(input.nextLine(), "1") ? Boolean.TRUE : Boolean.FALSE;
        } while (otraCalificacion);
    }

    private Estudiante buscarEstudiante(int id) {
        Estudiante estudiante = null;
        for (Estudiante e : this.estudiantes) {
            if (e.id == id) {
                estudiante = e;
                break;
            }
        }
        return estudiante;
    }
}

class Estudiante {
    int id;
    String nombre;
    List<Calificacion> calificaciones = new ArrayList<>();

    public void agregarCalificacion(Calificacion calif) {
        this.calificaciones.add(calif);
    }

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

    public Calificacion(float numero) {
        this.numero = numero;
        this.fecha = LocalDate.now();
    }
}
