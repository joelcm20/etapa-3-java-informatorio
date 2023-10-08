import java.util.Arrays;

public class Restalos {
    public static void main(String[] args) {
        int[] array1 = { 5, 4, 6, 3, 7 };
        int[] array2 = { 2, 3, 4, 6, 5 };
        int[] array3 = new int[array1.length];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            int resta = array1[i] - array2[i];
            if (resta > 0) {
                array3[count] = resta;
            } else {
                array3[count] = 0;
            }
            count++;
        }

        System.out.println(Arrays.toString(array3));
    }
}