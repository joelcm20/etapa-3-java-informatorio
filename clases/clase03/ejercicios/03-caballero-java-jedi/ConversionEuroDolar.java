import java.util.Scanner;

public class ConversionEuroDolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float tasa = 1.20f;

        System.out.print("Ingresar monto en auros: ");
        float euros = input.nextFloat();

        // calcular conversion y redondear a dos decimales
        float conversion = euros * tasa * 100 / 100;

        System.out.printf("%s euros = %s dolares\n", euros, conversion);
        input.close();
    }
}
