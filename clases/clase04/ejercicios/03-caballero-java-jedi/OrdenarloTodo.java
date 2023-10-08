public class OrdenarloTodo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double[] numeros = { 1.50, 3.45, 1.55, 2.20 };

        boolean flag = false;
        do {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    double aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    flag = true;
                } else {
                    flag = false;
                }
            }
        } while (flag);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}