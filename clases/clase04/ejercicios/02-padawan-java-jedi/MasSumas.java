public class MasSumas {
    public static void main(String[] args) {
        int desde = 1;
        int hasta = 10;
        int suma = 0;

        for (int i = desde; i <= hasta; i++) {
            suma = suma + i;
        }

        System.out.printf("Suma desde %s hasta %s: %s", desde, hasta, suma);
    
    }
}