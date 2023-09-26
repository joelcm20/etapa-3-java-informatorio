public class MenuOpciones {
    public static void main(String[] args) {
        String menu = "MENU DE OPCIONES:\n1: opcion 1.\n2: opcion 2.\n3: opcion 3.\n";
        String opcionElegida = "2";

        while (true) {
            System.out.print(menu);
            System.out.printf("Opcion elegida: %s\n", opcionElegida);
            break;
        }
    }
}