import java.util.Scanner;

public class ConversionLibraEsterlinaDolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float tasa = 1.40f;

        System.out.print("Ingresar monto en libras esterlinas: ");
        float libresEsterlinas = input.nextFloat();

        // calcular conversion y redondear a dos decimales
        float conversionDolar = libresEsterlinas * tasa * 100 / 100;

        System.out.printf("%s libras esterlinas = %s dolares", libresEsterlinas, conversionDolar);
        input.close();
    }
}