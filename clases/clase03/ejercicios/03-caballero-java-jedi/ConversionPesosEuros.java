import java.util.Scanner;

public class ConversionPesosEuros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float tasa = 1000;

        System.out.print("Ingrese un monto en pesos argentinos: ");
        float pesos = input.nextFloat();

        // calcular conversion y redondear a dos decimales
        float conversionEuro = pesos / tasa * 100 / 100;

        System.out.printf("%s pesos = %s euros", pesos, conversionEuro);
        input.close();
    }
}
