package ejercicios.iniciado_java_jedi;

import java.time.LocalDate;

class Uno1 {
    public void ejecutar() {
        System.out.println("Ejercicio 1:");

        // alumnos
        Alumno alumno1 = new Alumno("joel", "chavez", LocalDate.of(2002, 5, 29), 21);
        Alumno alumno2 = new Alumno("pepe", "almiron", LocalDate.of(1999, 10, 14), 24);
        Alumno alumno3 = new Alumno("juan", "escalante", LocalDate.of(2004, 3, 2), 20);
        Alumno[] alumnos = { alumno1, alumno2, alumno3 };

        for (Alumno alumno : alumnos) {
            System.out.printf("%s %s, %d años.\n", alumno.nombre, alumno.apellido, alumno.edad);
        }
        System.out.println();
    }
}

class Alumno {
    String nombre;
    String apellido;
    LocalDate fecha_nacimiento;
    int edad;

    public Alumno() {}

    public Alumno(String nombre, String apellido, LocalDate fecha_nacimiento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
    }
}