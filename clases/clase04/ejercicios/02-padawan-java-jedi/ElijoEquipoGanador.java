public class EquiposGanadores {
    public static void main(String[] args) {
        // equipos
        String equipo1 = "Manchester City";
        String equipo2 = "Real Madrid";

        // DT's
        String dtEquipo1 = "Carlo Ancelotti";
        String dtEquipo2 = "Pep Guardiola";

        // jugadores Manchester City
        String mancityJugador1 = "Ederson";
        String mancityJugador2 = "Stefan Ortega";
        String mancityJugador3 = "Julián Álvarez";

        // jugadores Real Madrid
        String realMadridJugador1 = "Thibaut Courtois";
        String realMadridJugador2 = "Éder Militão";
        String realMadridJugador3 = "Jude Bellingham";

        // menu
        String menu = "MENU EQUIPOS: Elije la info de que quipo ver.\n1.Manchester City.\n2.Real Madrid.";
        String opcionElegida = "2";

        if (opcionElegida == "1") {
            System.out.printf("Manchester City: %s(DT)\n- %s\n- %s\n- %s\n", dtEquipo2, mancityJugador1,
                    mancityJugador2,
                    mancityJugador3);

        } else if (opcionElegida == "2") {
            System.out.printf("Real Madrid: %s(DT)\n- %s\n- %s\n- %s\n", dtEquipo1, realMadridJugador1,
                    realMadridJugador2,
                    realMadridJugador3);
        } else {
            System.out.println("opcion invalida.");
        }
    }
}