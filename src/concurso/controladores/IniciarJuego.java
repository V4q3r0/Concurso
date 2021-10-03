
package concurso.controladores;

import concurso.modelos.Jugador;
import concurso.modelos.Preguntas;
import concurso.modelos.Respuestas;
import concurso.vistas.FinalGame;
import concurso.vistas.Inicio;
import concurso.vistas.InicioGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IniciarJuego implements ActionListener{
    
    Jugador jugador = new Jugador();
    Inicio inicio = new Inicio();
    InicioGame inicioGame = new InicioGame();
    Preguntas pregunta = new Preguntas();
    Respuestas respuesta = new Respuestas();
    int contador = 1;
    

    public IniciarJuego() {
    }
    
    public IniciarJuego(Jugador jugador, Inicio inicio, InicioGame inicioGame) {
        this.jugador = jugador;
        this.inicio = inicio;
        this.inicioGame = inicioGame;
        inicio.btnStart.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Juego(contador);
    }
    
    public void Juego(int contador){
        if(contador <= 5){
            System.out.println(contador);
            jugador.obtenerJugador(String.valueOf(inicio.txtName.getText()));
        
            inicioGame.namePlayer.setText(jugador.getNombre());
            inicioGame.scorePlayer.setText(String.valueOf(jugador.getPuntos()));
            inicioGame.nivelPlayer.setText(String.valueOf(jugador.getNivel()));
            pregunta.obtenerPregunta(contador);
            inicioGame.lblPregunta.setText(contador + ".  " +pregunta.getPregunta());
            ResultSet datos = respuesta.obtenerRespuestas(pregunta.getId());
            String[] res = new String[4];
            int id = 0;
            int i = 1;
            try {
                while(datos.next()){
                    datos.absolute(i);
                    res[i-1] = datos.getString("respuesta");
                    if(datos.getBoolean("correcta")){
                        id = datos.getInt("id");
                    }
                    i++;
                }
                datos.close();
            } catch (SQLException ex) {
                Logger.getLogger(IniciarJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
            inicioGame.opcion1.setText(res[0]);
            inicioGame.opcion2.setText(res[1]);
            inicioGame.opcion3.setText(res[2]);
            inicioGame.opcion4.setText(res[3]);

            ContinuarJuego continuar = new ContinuarJuego(jugador, inicio, respuesta, inicioGame, pregunta, id, contador);

            inicio.setVisible(false);
            inicioGame.setVisible(true);
        }else{
            FinalJuego(jugador);
        }
        
    }
    
    public void FinalJuego(Jugador jugador){
        inicioGame.setVisible(false);
        FinalGame finalGame = new FinalGame();
        finalGame.setVisible(true);
        finalGame.datoNombre.setText(jugador.getNombre());
        finalGame.datoNivel.setText(String.valueOf(jugador.getNivel()));
        finalGame.datoPuntos.setText(String.valueOf(jugador.getPuntos()));
    }
    
}
