public class EquiposGanadores {
    public static void main(String[] args) {
        // equipos
        String equipo1 = "Manchester City";
        String equipo2 = "Real Madrid";

        // DT's
        // String dtEquipo1 = "Carlo Ancelotti";
        // String dtEquipo2 = "Pep Guardiola";

        // jugadores Manchester City
        String mancityJugador1 = "Ederson";
        String mancityJugador2 = "Stefan Ortega";
        String mancityJugador3 = "Julián Álvarez";

        // jugadores Real Madrid
        String realMadridJugador1 = "Thibaut Courtois";
        String realMadridJugador2 = "Éder Militão";
        String realMadridJugador3 = "Jude Bellingham";

        System.out.printf("%s:\n- %s\n- %s\n- %s\n", equipo1, mancityJugador1, mancityJugador2, mancityJugador3);
        System.out.printf("%s:\n- %s\n- %s\n- %s\n", equipo2, realMadridJugador1, realMadridJugador2,
                realMadridJugador3);
    }
}