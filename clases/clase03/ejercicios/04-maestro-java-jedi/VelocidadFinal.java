public class VelocidadFinal {
    public static void main(String[] args) {
        final double G = 9.81;
        final double V_I = 0;
        final double T = 3; // tiempo transcurrido en segundos

        double velocidadFinal = V_I + G * T; // km/s
        System.out.printf("Velocidad final: %s", velocidadFinal);
    }
}