
package concurso.controladores;

import concurso.modelos.Jugador;
import concurso.modelos.Preguntas;
import concurso.modelos.Respuestas;
import concurso.vistas.Inicio;
import concurso.vistas.InicioGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class ContinuarJuego implements ActionListener{
    
    Jugador jugador = new Jugador();
    Inicio inicio = new Inicio();
    InicioGame inicioGame = new InicioGame();
    Preguntas pregunta = new Preguntas();
    Respuestas respuesta = new Respuestas();
    int id, contador;
    
    public ContinuarJuego(){
        
    }
    
    public ContinuarJuego(Jugador jugador, Inicio inicio, Respuestas respuesta, InicioGame inicioGame, Preguntas pregunta, int id, int contador){
        this.id = id;
        this.inicio = inicio;
        this.inicioGame = inicioGame;
        this.jugador = jugador;
        this.pregunta = pregunta;
        this.contador = contador;
        this.respuesta = respuesta;
        inicioGame.btnEnviarRespuesta.addActionListener(this);
    }
    
    public void Limpiar(ButtonGroup button){
        button.clearSelection();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(inicioGame.grupoRespuestas.getSelection() == null){
            //
        }
        else{
            IniciarJuego iniciar = new IniciarJuego(jugador, inicio, inicioGame);
            String res = getSelectedButtonText(inicioGame.grupoRespuestas);
            String res2 = respuesta.obtenerRespuesta(this.id);

            if(res.equals(res2)){
                jugador.setNivel(jugador.getNivel()+1);
                jugador.setPuntos(jugador.getPuntos()+100);
                jugador.guardarJugador();
                try {
                    iniciar.Juego(contador+1);
                } catch (SQLException ex) {
                    Logger.getLogger(ContinuarJuego.class.getName()).log(Level.SEVERE, null, ex);
                }

            }else{
                jugador.setNivel(0);
                jugador.setPuntos(0);
                jugador.guardarJugador();
                iniciar.FinalJuegoLose(jugador);
            }
            Limpiar(inicioGame.grupoRespuestas);
        }
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    
}
