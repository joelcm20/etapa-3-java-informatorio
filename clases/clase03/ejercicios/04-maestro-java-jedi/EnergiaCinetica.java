public class EnergiaCinetica {
    public static void main(String[] args) {
        /*
         * FORMULA:
         * E = (1/2) * m * v^2, donde E es la energía cinética, m es la mas
         * del objeto y v es la velocidad.
         */

        final double MASA = 5;
        final double VELOCIDAD = 100;

        double energiaCinetica = (1.0 / 2.0) * MASA * Math.pow(VELOCIDAD, 2);

        System.out.println("Energia cinetica de un objeto en movimiento:");
        System.out.printf("Velocidad: %s\nMasa: %s\n", VELOCIDAD, MASA);
        System.out.printf("Energia cinetica: %s", energiaCinetica);

    }
}