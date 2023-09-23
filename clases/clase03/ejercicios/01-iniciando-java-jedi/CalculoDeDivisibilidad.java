public class CalculoDeDivisibilidad {
    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 10;
        int suma = numero1 + numero2;
        boolean numero1EsDivisiblePorNumero2 = numero1 % numero2 == 0;
        String mensaje = numero1EsDivisiblePorNumero2 ? "es divisible por el segundo" : "no divisible por el segundo";
        System.out.printf("La suma es %d y el primer numero %s", suma, mensaje);
    
    }
}