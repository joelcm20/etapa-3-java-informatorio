public class HipotenusaTriangulo {
    public static void main(String[] args) {
        double lado1 = 5;
        double lado2 = 12;
        double hipotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        System.out.printf("La hipotenusa de un triangulo rectangulo con lados A=%s y B=%s = %s", lado1, lado2,
                hipotenusa);
    }
}