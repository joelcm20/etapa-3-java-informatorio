public class TrianguloAsteriscos {
    public static void main(String[] args) {
        String triangulo = "";

        int index = 1;
        int base = 10;

        while (index <= base) {
            String estrellas = "*".repeat(index);
            estrellas = estrellas + " ".repeat(base - index) + "\n";
            triangulo = triangulo + estrellas;
            index++;
        }

        System.out.println(triangulo);
    }
}
