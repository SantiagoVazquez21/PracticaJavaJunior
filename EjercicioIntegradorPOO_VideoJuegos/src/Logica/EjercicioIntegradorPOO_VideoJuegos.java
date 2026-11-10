package Logica;

import java.util.ArrayList;
import java.util.List;

public class EjercicioIntegradorPOO_VideoJuegos {

    public static void main(String[] args) {
        
        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego> ();
        
        VideoJuego juego1 = new VideoJuego(1L, "Resident Evil 4", "Nintendo Switch", 1, "Terror");
        VideoJuego juego2 = new VideoJuego(2L, "Mario 64", "Nintendo 64", 2, "Accion y Aventura");
        VideoJuego juego3 = new VideoJuego(3L, "Rocket League", "PlayStation 4", 4, "Competitivo");
        VideoJuego juego4 = new VideoJuego(4L, "Tricky Towers", "PlayStation 4", 2, "Estrategia");
        VideoJuego juego5 = new VideoJuego(5L, "The Legends of Zelda", "Nintendo 64", 1, "Accion y Aventura");
        
        listaVideojuegos.add(juego1);
        listaVideojuegos.add(juego2);
        listaVideojuegos.add(juego3);
        listaVideojuegos.add(juego4);
        listaVideojuegos.add(juego5);
        
        System.out.println("------Todos los Videojuegos------");
        for (VideoJuego juego : listaVideojuegos) {
            System.out.println("Titulo: " + juego.getTitulo() + " Consola: " + juego.getConsola() + " Cantidad de jugadores: " + juego.getCantJugadores());
        }
        
        juego1.setTitulo("Residen Evil 5");
        juego1.setCantJugadores(2);
        
        juego2.setTitulo("Mario Party");
        juego2.setCantJugadores(4);
        
        System.out.println("------Videojuegos despues del cambio------");
        for (VideoJuego juego : listaVideojuegos) {
            System.out.println(juego.toString());
        }        
        
        System.out.println("------Videojuegos de la Nintendo 64------");
        for (VideoJuego juego : listaVideojuegos) {
            if (juego.getConsola().equals("Nintendo 64")) {
                System.out.println(juego.toString());
            }
        }
    }
    
}
