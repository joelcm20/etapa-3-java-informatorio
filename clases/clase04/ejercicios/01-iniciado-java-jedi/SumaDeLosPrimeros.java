public class SumaDeLosPrimeros {
    public static void main(String[] args) {
        int numerosNaturales = 4;
        int suma = 0;

        int i = 1;
        while (i <= numerosNaturales) {
            suma += i;
            i++;
        }

        System.out.printf("la suma de los primeros %s numeros es: %s", numerosNaturales, suma);
    }
}
