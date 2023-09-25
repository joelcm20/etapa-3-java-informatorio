public class MediaAritmetica {
    public static void main(String[] args) {
        double numero1 = 1;
        double numero2 = 2;
        double numero3 = 3;

        final int CANTIDAD_NUMEROS = 3;

        double sumaTotal = numero1 + numero2 + numero3;
        double mediaAritmetica = sumaTotal / CANTIDAD_NUMEROS;
        System.out.printf("numero 1: %s\nnumero 2: %s\nnumero 3: %s\nmedia aritmetica: %s", numero1, numero2, numero3,
                mediaAritmetica);
    }
}