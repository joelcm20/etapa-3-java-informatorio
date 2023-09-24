import java.util.Scanner;

public class ConversionBitcoinsDolares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float tasa = 50000;

        System.out.print("Ingresa un monto en bitcoins: ");
        float bitcoins = input.nextFloat();

        float conversionDolar = bitcoins * tasa * 100 / 100;

        System.out.printf("%s bitcoins = %s dolares", bitcoins, conversionDolar);
        input.close();
    }
}
