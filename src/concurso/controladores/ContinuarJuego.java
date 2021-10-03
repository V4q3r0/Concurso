
package concurso.controladores;

import concurso.modelos.Jugador;
import concurso.modelos.Preguntas;
import concurso.modelos.Respuestas;
import concurso.vistas.Inicio;
import concurso.vistas.InicioGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
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

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(inicioGame.grupoRespuestas.getSelection() == null){
            inicioGame.lblMessage.setText("Debes seleccionar una de las opciones.");
        }
        IniciarJuego iniciar = new IniciarJuego(jugador, inicio, inicioGame);
        String res = "";
        res = getSelectedButtonText(inicioGame.grupoRespuestas);
        String res2 = "";
        res2 = respuesta.obtenerRespuesta(this.id);
        
        if(res.equals(res2)){
            int puntos = jugador.getPuntos() + 100;
            int nivel = jugador.getNivel() + 1;
            jugador.guardarJugador(jugador.getId(), jugador.getNombre(), nivel, puntos);
            iniciar.Juego(contador+1);
            
        }else{
            System.out.println(res+res2);
            jugador.guardarJugador(jugador.getId(), jugador.getNombre(), 0, 0);
            iniciar.FinalJuego(jugador);
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
