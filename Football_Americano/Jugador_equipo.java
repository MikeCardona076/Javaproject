abstract class Jugador_equipo{ 

    void fuerza_judador(double fuerza_asignada){
    
        System.out.println("La fuerza del jugador es " + fuerza_asignada * 10);
        
    }   

    void nombre_jugador(String Nombre_jugador ){
    
        System.out.println("El nombre  del jugador es " + Nombre_jugador);

    }

    void velocidad_jugador(double velocidad_asignada){
        System.out.println("La velocidad del jugador es " + velocidad_asignada * 30);

    }

    void estatura_jugador(double estatura_asignada){
        System.out.println("La estatura es "+ estatura_asignada);
    }
}
