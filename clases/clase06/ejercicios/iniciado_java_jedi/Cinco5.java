package ejercicios.iniciado_java_jedi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cinco5 {
    List<Alumno> alumnos = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();

    public void ejecutar() {
        System.out.println("Ejercicio 5: ");

        Scanner input = new Scanner(System.in);
        this.crearAlumnos(input);
        this.createCursos(input);
        input.close();
    }

    public void crearAlumnos(Scanner input) {
        boolean flag = Boolean.FALSE;

        do {
            Alumno alumno = new Alumno();
            System.out.print("Nombre del alumno: ");
            alumno.nombre = input.nextLine();

            System.out.print("Apellido del alumno: ");
            alumno.apellido = input.nextLine();

            System.out.print("Fecha de nacimiento del alumno(yyy-mm-dd): ");
            alumno.fecha_nacimiento = LocalDate.parse(input.nextLine());

            System.out.print("Edad del alumno: ");
            alumno.edad = Integer.parseInt(input.nextLine());
            this.alumnos.add(alumno);

            System.out.print("¿Agregar otro alumno? false:no | true:si): ");
            flag = Boolean.parseBoolean(input.nextLine());
        } while (flag);
    }

    public void createCursos(Scanner input) {
        boolean flag = Boolean.FALSE;

        do {
            Curso curso = new Curso();
            System.out.print("Nombre del curso: ");
            curso.nombre = input.nextLine();

            System.out.print("¿Esta habilitado? (true:si | false:no): ");
            curso.habilitado = Boolean.parseBoolean(input.nextLine());

            System.out.print("Descripcion del curso: ");
            curso.descripcion = input.nextLine();

            System.out.println("Alumnos:");
            for (int i = 0; i < this.alumnos.size(); i++) {
                System.out.printf("Nº %d %s.\n", i, this.alumnos.get(i).nombre);
            }

            // seleccionar alumnos para agregarlos al curso
            System.out.print("Separar con \",\" los numeros de alumnos a agregar: ");
            String[] alumnosAgregar = input.nextLine().split(",");

            // agregar los alumnos seleccionados al curso
            for (String i : alumnosAgregar) {
                curso.setAlumnos(this.alumnos.get(Integer.parseInt(i)));
            }

            // agregar nuevo cuso
            this.cursos.add(curso);

            System.out.print("¿Agregar otro curso? false:no | true:si): ");
            flag = Boolean.parseBoolean(input.nextLine());
        } while (flag);

        // imprimir informacion de los cursos
        for (Curso curso : this.cursos) {
            curso.printInfo();
        }
    }
}
