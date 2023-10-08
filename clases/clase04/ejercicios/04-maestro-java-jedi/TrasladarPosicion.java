import java.util.Arrays;

public class TrasladarPosicion {
    public static void main(String[] args) {
        int[] enteros = { 1, 2, 3, 4, 5 };
        int posicion = 0;
        int trasladar = 4;

        if (enteros.length - 1 - posicion < trasladar) {
            System.out.println("numero de traslado invalido.");
        } else {
            int aux = enteros[posicion];
            enteros[posicion] = enteros[posicion + trasladar];
            enteros[posicion + trasladar] = aux;
            System.out.printf("Translado completo: %s", Arrays.toString(enteros));
        }
    }
}
