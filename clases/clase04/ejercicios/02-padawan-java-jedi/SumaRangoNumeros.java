public class SumaRangoNumeros {
    public static void main(String[] args) {
        int rango = 10;
        int sumaImpares = 0;

        for (int i = 1; i <= rango; i++) {
            if (i % 2 != 0) {
                sumaImpares += i;
            }
        }

        System.out.printf("Suma de impares en un rango de %s: %s", rango, sumaImpares);
    }
}