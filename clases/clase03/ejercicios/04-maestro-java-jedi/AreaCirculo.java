public class AreaCirculo {
    public static void main(String[] args) {
        // formula: Area = PI x R^2
        final double PI = 3.14159265359f;
        double radio = 5;
        double area = PI * Math.pow(radio, 2);

        System.out.printf("El area de un cirulo con radio %s es: %s", radio, area);
    }
}