public class Factorial {
    public static void main(String[] args) {
        int numero = 5;
        int factorial = 1;

        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }

        System.out.printf("Factorial de %s es: %s", numero, factorial);
    }
}