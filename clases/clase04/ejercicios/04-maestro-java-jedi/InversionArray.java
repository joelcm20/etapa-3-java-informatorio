import java.util.Arrays;

public class InversionArray {
    public static void main(String[] args) {
        int[] enteros = { 1, 2, 3, 4, 5 };
        int[] enterosInvertido = new int[enteros.length];
        int count = 0;

        for (int i = enteros.length - 1; i >= 0; i--) {
            enterosInvertido[count] = enteros[i];
            count++;
        }

        System.out.printf("Array Invertido: %s", Arrays.toString(enterosInvertido));
    }
}
