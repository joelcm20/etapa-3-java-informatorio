import java.util.Scanner;

public class ConversionDolares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float tasa = 1000;

        System.out.print("Ingresar monto en dolares: ");
        float dolares = input.nextFloat();

        // calcular conversion y redondear a dos decimales
        float conversionPesos = dolares * tasa * 100 / 100;

        System.out.printf("%s dolares = %s pesos argentinos\n", dolares, conversionPesos);
        input.close();
    }
}
