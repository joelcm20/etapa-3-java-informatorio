public class EsperoAprobar {
    public static void main(String[] args) {
        float nota1 = 5.0f;
        float nota2 = 5.0f;
        float nota3 = 6.0f;
        float promedio = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Notas de examen: %s %s %s.\n", nota1, nota2, nota3);
        System.out.printf("%s con una promedio de %s", promedio > 6 ? "aprobe" : "desaprobe", promedio);
    }
}
