public class SumaDeNumeros {
    public static void main(String[] args) {
        int numero = 15;
        String paridad = "impar";

        if (numero % 2 == 0) {
            paridad = "par";
        }

        System.out.printf("%s es %s", numero, paridad);
    }
}