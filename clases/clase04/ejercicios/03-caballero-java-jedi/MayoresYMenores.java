public class MayoresYMenores {
    public static void main(String[] args) {
        int[] enteros = { 4, 6, 5, 3, 7, 2, 8, 1, 9, 10 };
        int buscarNumero = 10;
        int numeroEncontrado = 0;

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] == buscarNumero) {
                numeroEncontrado = enteros[i];
            }
        }

        if (numeroEncontrado != 0) {
            System.out.println(numeroEncontrado);
        } else {
            System.out.printf("No se encontro el numero %d", buscarNumero);
        }
    }
}