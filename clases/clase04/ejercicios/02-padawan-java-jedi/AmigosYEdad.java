public class AmigosYEdad {
    public static void main(String[] args) {
        String amigo1 = "amigo1";
        int edadAmigo1 = 10;
        String amigo2 = "amigo2";
        int edadAmigo2 = 20;
        String amigo3 = "amigo3";
        int edadAmigo3 = 30;

        int i = 0;
        while (i < 3) {
            if (i == 0) {
                if (edadAmigo1 >= 18) {
                    System.out.println(amigo1);
                } else {
                    System.out.println("sos menor de edad");
                }
            } else if (i == 1) {
                if (edadAmigo2 >= 18) {
                    System.out.println(amigo2);
                } else {
                    System.out.println("sos menor de edad");
                }
            } else if (i == 2) {
                if (edadAmigo3 >= 18) {
                    System.out.println(amigo3);
                } else {
                    System.out.println("sos menor de edad");
                }
            }
            i++;
        }
    }
}