public class MayoresYMenores2 {
    public static void main(String[] args) {
        int[] enteros = {4,6,5,3,7,2,8,1,9,10};
        int menor = enteros[0];
        int mayor = enteros[0];

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] > mayor){
                mayor = enteros[i];
            }
            if(enteros[i] < menor){
                menor = enteros[i];
            }
        }

        System.out.printf("El numero menor es: %d.\n", menor);
        System.out.printf("El numero mayor es: %d.\n", mayor);
    }
}
