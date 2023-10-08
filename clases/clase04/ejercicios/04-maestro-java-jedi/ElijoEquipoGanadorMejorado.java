import java.util.Arrays;

public class ElijoEquipoGanadorMejorado {
    public static void main(String[] args) {
        // equipos
        String[] equipos = { "Manchester City", "Real Madrid" };

        // DT's
        String[] dtEquipos = { "Carlo Ancelotti", "Pep Guardiola" };

        // jugadores Manchester City
        String[] mancityJugadores = { "Ederson", "Stefan Ortega", "Julián Álvarez" };

        // jugadores Real Madrid
        String[] realMadridJugadores = { "Thibaut Courtois", "Éder Militão", "Jude Bellingham" };

        // menu
        String menu = "MENU EQUIPOS: Elije la info de que quipo ver.\n1.Manchester City.\n2.Real Madrid.";
        String opcionElegida = "2";

        if (opcionElegida == "1") {
            System.out.println(menu);
            System.out.printf("%s: %s(DT)\n- jugadores: %s\n", equipos[0], dtEquipos[1],
                    Arrays.toString(mancityJugadores));

        } else if (opcionElegida == "2") {
            System.out.println(menu);
            System.out.printf("%s: %s(DT)\n- jugadores: %s\n", equipos[1], dtEquipos[0],
                    Arrays.toString(realMadridJugadores));
        } else {
            System.out.println("opcion invalida.");
        }
    }
}
