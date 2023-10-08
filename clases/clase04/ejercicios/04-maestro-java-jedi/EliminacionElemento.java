public class EliminacionElemento {
    public static void main(String[] args) {
        int[] enteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int eliminarNumero = 4;
        boolean encontrado = false;

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] == eliminarNumero) {
                enteros[i] = 0;
                encontrado = true;
                System.out.printf("Numero %d eliminado.", eliminarNumero);
                break;
            }
        }

        if (!encontrado) {
            System.out.printf("Numero %d no encontrado.", eliminarNumero);
        }
    }
}
