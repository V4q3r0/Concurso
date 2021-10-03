
package concurso.vistas;


public class InicioGame extends javax.swing.JFrame {

    
    public InicioGame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRespuestas = new javax.swing.ButtonGroup();
        tituloNombre = new javax.swing.JLabel();
        tituloPuntos = new javax.swing.JLabel();
        tituloNivel = new javax.swing.JLabel();
        namePlayer = new javax.swing.JLabel();
        scorePlayer = new javax.swing.JLabel();
        nivelPlayer = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblPregunta = new javax.swing.JLabel();
        opcion1 = new javax.swing.JRadioButton();
        opcion2 = new javax.swing.JRadioButton();
        opcion3 = new javax.swing.JRadioButton();
        opcion4 = new javax.swing.JRadioButton();
        btnEnviarRespuesta = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloNombre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloNombre.setText("Nombre");

        tituloPuntos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloPuntos.setText("Puntos");

        tituloNivel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloNivel.setText("Nivel");

        namePlayer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        scorePlayer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        nivelPlayer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnSalir.setBackground(new java.awt.Color(204, 204, 204));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblPregunta.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblPregunta.setText("Esté es un ejemplo de una pregunta, para tener una base de tamaño.");

        grupoRespuestas.add(opcion1);
        opcion1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        opcion1.setText("jRadioButton1");

        grupoRespuestas.add(opcion2);
        opcion2.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        opcion2.setText("jRadioButton2");

        grupoRespuestas.add(opcion3);
        opcion3.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        opcion3.setText("jRadioButton3");

        grupoRespuestas.add(opcion4);
        opcion4.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        opcion4.setText("jRadioButton4");

        btnEnviarRespuesta.setBackground(new java.awt.Color(0, 255, 0));
        btnEnviarRespuesta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEnviarRespuesta.setText("Comprobar");
        btnEnviarRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarRespuestaActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloNombre)
                    .addComponent(namePlayer))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPuntos)
                    .addComponent(scorePlayer))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nivelPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(btnEnviarRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(lblMessage)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloPuntos)
                    .addComponent(tituloNombre)
                    .addComponent(tituloNivel))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namePlayer)
                    .addComponent(scorePlayer)
                    .addComponent(nivelPlayer))
                .addGap(20, 20, 20)
                .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnEnviarRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEnviarRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarRespuestaActionPerformed
        
    }//GEN-LAST:event_btnEnviarRespuestaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEnviarRespuesta;
    private javax.swing.JButton btnSalir;
    public javax.swing.ButtonGroup grupoRespuestas;
    public javax.swing.JLabel lblMessage;
    public javax.swing.JLabel lblPregunta;
    public javax.swing.JLabel namePlayer;
    public javax.swing.JLabel nivelPlayer;
    public javax.swing.JRadioButton opcion1;
    public javax.swing.JRadioButton opcion2;
    public javax.swing.JRadioButton opcion3;
    public javax.swing.JRadioButton opcion4;
    public javax.swing.JLabel scorePlayer;
    private javax.swing.JLabel tituloNivel;
    private javax.swing.JLabel tituloNombre;
    private javax.swing.JLabel tituloPuntos;
    // End of variables declaration//GEN-END:variables
}
