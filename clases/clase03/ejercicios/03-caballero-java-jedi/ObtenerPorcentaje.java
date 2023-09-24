public class ObtenerPorcentaje {
    public static void main(String[] args) {
        double numero1 = 20.33;
        int numero2 = 21;
        double porcentaje = numero2 * numero1 / 100;
        System.out.printf("El %d por ciento de %f es: %f\n", numero2, numero1, porcentaje);
    }
}
