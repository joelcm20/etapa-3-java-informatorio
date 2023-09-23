public class PromedioDeEdad {
    public static void main(String[] args) {
        String nombre1 = "nombre1";
        int edadNombre1 = 20;
        String nombre2 = "nombre2";
        int edadNombre2 = 21;
        String nombre3 = "nombre3";
        int edadNombre3 = 22;

        int promedioEdad = edadNombre1 + edadNombre2 + edadNombre3 / 3;

        System.out.printf("%s de %d años\n", nombre1, edadNombre1);
        System.out.printf("%s de %d años\n", nombre2, edadNombre2);
        System.out.printf("%s de %d años\n", nombre3, edadNombre3);
        System.out.printf("El promedio de sus edades es de %d\n", promedioEdad);
    }
}