
package concurso;

import concurso.controladores.IniciarJuego;
import concurso.modelos.Jugador;
import concurso.vistas.Inicio;
import concurso.vistas.InicioGame;

public class Concurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        InicioGame inicioGame = new InicioGame();
        Jugador jugador = new Jugador();
        IniciarJuego iniciarJuego = new IniciarJuego(jugador, inicio, inicioGame);
    }
    
    
    
}
