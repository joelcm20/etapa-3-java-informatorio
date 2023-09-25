public class FuerzaCentripeta {
    public static void main(String[] args) {
        final double MASA = 120;
        final double VELOCIDAD = 500;
        final double RADIO = 10;

        double fuerzaCentripeta = MASA * Math.pow(VELOCIDAD, 2) / RADIO;
        System.out.printf("Fuerza centripeta: %s", fuerzaCentripeta);
    }
}