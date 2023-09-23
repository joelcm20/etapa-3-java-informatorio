public class ConversionKG {
    public static void main(String[] args) {
        final float librasAKiloGramos = 0.45359237f;
        float libras = 124f;
        float kiloGramos = libras * librasAKiloGramos;
        System.out.printf("%f libras = %f kg\n", libras, kiloGramos);
    }
}
