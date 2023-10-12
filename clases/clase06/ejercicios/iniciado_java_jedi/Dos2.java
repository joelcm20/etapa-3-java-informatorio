package ejercicios.iniciado_java_jedi;

import java.time.LocalDate;

class Dos2 {
    public void ejecutar() {
        System.out.println("Ejercicio 2:");
        // curso
        Curso curso1 = new Curso("ingles", Boolean.TRUE, "curso de ingles", null);

        // alumnos
        Alumno alumno1 = new Alumno("joel", "chavez", LocalDate.of(2002, 5, 29), 21);
        Alumno alumno2 = new Alumno("pepe", "almiron", LocalDate.of(1999, 10, 14), 24);
        Alumno alumno3 = new Alumno("juan", "escalante", LocalDate.of(2004, 3, 2), 20);

        curso1.setAlumnos(alumno1, alumno2, alumno3);
        curso1.printInfo();
        System.out.println();
    }
}

class Curso {
    String nombre;
    boolean habilitado;
    String descripcion;
    Alumno[] alumnos;

    public Curso() {}

    public Curso(String nombre, boolean habilitado, String descripcion, Alumno[] alumnos) {
        this.nombre = nombre;
        this.habilitado = habilitado;
        this.descripcion = descripcion;
        this.alumnos = alumnos;
    }

    public void setAlumnos(Alumno... alumnos) {
        this.alumnos = alumnos;
    }

    public void printInfo() {
        System.out.printf("Curso: %s.\nDescripcion: %s.\nAlumnos:\n", this.nombre, this.descripcion);
        for (Alumno alumno : this.alumnos) {
            System.out.printf("- %s.\n", alumno.nombre);
        }
    }
}