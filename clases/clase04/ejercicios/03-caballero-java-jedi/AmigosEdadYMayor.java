public class AmigosEdadYMayor {
    public static void main(String[] args) {
        String[][] amigos = { { "amigo1", "20" }, { "amigo2", "13" }, { "amigo3", "22" } };
        String[] amigoMayor = amigos[0];

        for (int i = 0; i < amigos.length; i++) {
            int edad = Integer.parseInt(amigos[i][1]);
            String nombre = amigos[i][0];
            if (edad >= 18) {
                System.out.println(nombre);
            } else {
                System.out.println("amigo menor de edad.");
            }

            if (edad > Integer.parseInt(amigoMayor[1])) {
                amigoMayor = amigos[i];
            }
        }

        System.out.printf("El amigo mayor es %s con una edad de %s", amigoMayor[0], amigoMayor[1]);
    }
}