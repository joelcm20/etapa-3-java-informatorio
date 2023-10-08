import java.util.Arrays;

public class UnionArrelos {
    public static void main(String[] args) {
        String[] array1 = { "h", "o", "l", "a" };
        String[] array2 = { "q", "u", "e", "t", "a", "l", "?" };
        String[] array3 = new String[array1.length + array2.length];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            array3[count] = array1[i];
            count++;
        }
        for (int i = 0; i < array2.length; i++) {
            array3[count] = array2[i];
            
            count++;
        }

        System.out.printf("Union: %s", Arrays.toString(array3));
    }
}
