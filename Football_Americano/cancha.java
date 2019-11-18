public class cancha extends Campo_juego{
    public static void main(String[] args) {
        cancha oficial2 = new cancha();
        int yardas = 100;
        double tiempo_juego = 90.50;
        int jugadores = 30;
        oficial2.marcador(tiempo_juego);
        oficial2.yardas_cancha(yardas);
        oficial2.equipo(jugadores);

        Jugador_equipo get1_metodo = new Jugador_equipo() {
        };
        Arbitro get2_metodo = new Arbitro();
        Espectador get3_metodo = new Espectador();
        Balon get4_metodo = new Balon();

       
        get1_metodo.nombre_jugador("Mike el depredador");
        get3_metodo.nivel_grito(300);
        get2_metodo.Nombre_arbitro("Pedro el malo");
        get3_metodo.nivel_grito(100);
        get4_metodo.color_balon("Verde");



    }

    void yardas_cancha(int total_yardas) {
        System.out.println("El número de yardas que tiene la cancha es " + total_yardas);
    }
    
}