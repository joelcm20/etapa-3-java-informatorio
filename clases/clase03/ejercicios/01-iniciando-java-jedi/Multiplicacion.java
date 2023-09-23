public class Multiplicacion {
    public static void main(String[] args) {
        // numero reales
        double numeroReal1 = 5.60;
        double numeroReal2 = 7.33;
        double multiplicacionReales = numeroReal1 * numeroReal2;

        // numeros enteros
        int numero1 = 40;
        int numero2 = 34;
        int multiplicacionEnteros = numero1 * numero2;

        double resultado = multiplicacionReales + multiplicacionEnteros;
        System.out.printf("El resultado es un numero real: %s\n", resultado);
        System.out.println("Esto es asi ya que el tipo de dato predominante es el que tenga mayor precision");
    }
}