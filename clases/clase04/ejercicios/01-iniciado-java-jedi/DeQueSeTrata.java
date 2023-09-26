public class DeQueSeTrata {
    public static void main(String[] args) {
        int numero = 12;
        String elNumeroEs = "cero";

        if (numero < 0) {
            elNumeroEs = "negativo";
        } else if (numero > 0) {
            elNumeroEs = "positivo";
        }

        System.out.printf("el numero %s es: %s", numero, elNumeroEs);
    }
}
