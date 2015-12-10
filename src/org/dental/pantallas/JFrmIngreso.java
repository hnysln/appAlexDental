/**
 * JFrmIngreso.java
 * 09/12/2015
 */
package org.dental.pantallas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import org.dental.constantes.Constantes;
import org.dental.constantes.ConstantesURLS;
import org.dental.utilitarios.Util;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
public class JFrmIngreso extends javax.swing.JFrame {

    /**
     * Creates new form JFrmIngreso
     */
    public JFrmIngreso() {
        initComponents();
        this.setResizable(false);
        Dimension screenSize = Constantes.dimensionScreen(getGraphicsConfiguration());
        this.setSize(screenSize.width, screenSize.height);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        ImageIcon iconoVentana = new ImageIcon(getClass().getResource(ConstantesURLS.RUTA_IMAGEN_FONDO_SECUNDARIO));
        Image imagen = iconoVentana.getImage().getScaledInstance((screenSize.width), (screenSize.height), Image.SCALE_AREA_AVERAGING);
        jLblImagenFondo.setIcon(new ImageIcon(imagen));
        jLblImagenFondo.setSize(screenSize);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIngreso = new javax.swing.JPanel();
        jLblUsuario = new javax.swing.JLabel();
        jLblContrasenia = new javax.swing.JLabel();
        jTxtUsuario = new javax.swing.JTextField();
        jTxtContrasenia = new javax.swing.JPasswordField();
        jBntIngreso = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLblImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jPanelIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control de Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanelIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLblUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLblUsuario.setText("Usuario:");

        jLblContrasenia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLblContrasenia.setText("Contraseña: ");

        jTxtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtUsuarioKeyTyped(evt);
            }
        });

        jTxtContrasenia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTxtContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtContraseniaKeyPressed(evt);
            }
        });

        jBntIngreso.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jBntIngreso.setText("INGRESO");
        jBntIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntIngresoMouseClicked(evt);
            }
        });
        jBntIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntIngresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIngresoLayout = new javax.swing.GroupLayout(jPanelIngreso);
        jPanelIngreso.setLayout(jPanelIngresoLayout);
        jPanelIngresoLayout.setHorizontalGroup(
            jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblUsuario)
                    .addComponent(jLblContrasenia))
                .addGap(28, 28, 28)
                .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBntIngreso)
                    .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTxtUsuario)
                        .addComponent(jTxtContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanelIngresoLayout.setVerticalGroup(
            jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngresoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblUsuario)
                    .addComponent(jTxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblContrasenia)
                    .addComponent(jTxtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jBntIngreso)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelIngreso);
        jPanelIngreso.setBounds(340, 110, 410, 224);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("PERIODONTAL P.P.I");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 50, 550, 50);

        jLblImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/FondoSecundario.jpg"))); // NOI18N
        getContentPane().add(jLblImagenFondo);
        jLblImagenFondo.setBounds(0, 0, 1060, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtUsuarioKeyTyped
        Util.validarSoloLetras(evt);
//        if (jTxtUsuario.getText().trim().length() == Constantes.LONGITUD_NOMBRE_USUARIO) {
//            evt.consume();
//        }
    }//GEN-LAST:event_jTxtUsuarioKeyTyped

    private void jTxtContraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtContraseniaKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            jButton1MouseClicked(null);
//        }
    }//GEN-LAST:event_jTxtContraseniaKeyPressed

    private void jBntIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntIngresoMouseClicked
//        UsuarioDao usuarioDaoImplemen = new UsuarioDaoImplemen();
//        int numeroIntentos = 0;
//        try {
//            Usuario usuario = usuarioDaoImplemen.consultarUsuarioByNombre(jTxtUsuario.getText().trim());
//            if (usuario == null) {
//                JOptionPane.showMessageDialog(this, Util.mensajeShowOptionPanel("El usuario y/o contraseña son incorrectos."), "Información", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/com/imagenes/Success-icon.png")));
//
//            } else {
//                Usuario autenticado = usuarioDaoImplemen.consultarUsuarioByNombreAndPassw(jTxtUsuario.getText().trim(), jTxtContrasenia.getText());
//                if (autenticado == null) {
//                    JOptionPane.showMessageDialog(this, Util.mensajeShowOptionPanel("El usuario y/o contraseña son incorrectos."), "Información", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/com/imagenes/Success-icon.png")));
//
//                } else {
//                    this.setVisible(false);
//                    jFrmMenuPrincipal frmMenuPrincipal = new jFrmMenuPrincipal();
//                    frmMenuPrincipal.setVisible(true);
//                    frmMenuPrincipal.setUsuario(usuario);
//
//                }
//                //                LOG.info(usuario.getEstadousuario());
//                //                if (usuario.getEstadousuario()) {
//                    //                    if (!usuario.getValidacioningreso()) {
//                        //                        if (usuario.getPasswordusuario().toString().equals(jTxtPswd.getText())) {
//                            //                            usuario.setNumerointentos(Constantes.NUMERO_INTENTOS_DEFECTO);
//                            //                            usuario.setValidacioningreso(true);
//                            //                            usuarioDaoImplemen.update(usuario);
//                            //                            jFrmMenuPrincipal frmMenuPrincipal = new jFrmMenuPrincipal();
//                            //                            frmMenuPrincipal.setVisible(true);
//                            //                            frmMenuPrincipal.setUsuario(usuario);
//                            //                            this.setVisible(false);
//                            //                        } else {
//                            //
//                            //                            numeroIntentos = usuario.getNumerointentos() + 1;
//                            //                            usuario.setNumerointentos(numeroIntentos);
//                            //                            usuario.setValidacioningreso(false);
//                            //                            if (numeroIntentos == Constantes.MAXIMO_NUMERO_INTENTOS) {
//                                //                                usuario.setEstadousuario(false);
//                                //                            }
//                            //                            usuarioDaoImplemen.update(usuario);
//                            //                            cleanFields("");
//                            //                            JOptionPane.showMessageDialog(this, Util.mensajeShowOptionPanel("El usuario y/o contraseña son incorrectos."), "Información", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/com/imagenes/Success-icon.png")));
//                            //
//                            //                        }
//                        //                    } else {
//                        //                        JOptionPane.showMessageDialog(this, Util.mensajeShowOptionPanel("El usuario ya se encuentra autenticado."), "Información", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/com/imagenes/Success-icon.png")));
//                        //
//                        //                    }
//                    //
//                    //                } else {
//                    //                    JOptionPane.showMessageDialog(this, Util.mensajeShowOptionPanel("Usuario bloqueado."), "Información", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/com/imagenes/Success-icon.png")));
//                    //                }
//            }
//
//        } catch (Exception ex) {
//            LOG.error(ex);
//            JOptionPane.showMessageDialog(this, Util.mensajeShowOptionPanel("El usuario y/o contraseña son incorrectos."), "Información", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/com/imagenes/Success-icon.png")));
//
//        }
    }//GEN-LAST:event_jBntIngresoMouseClicked

    private void jBntIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntIngresoActionPerformed
        JFrmMenuPrincipal jFrmMenuPrincipal = new JFrmMenuPrincipal();
        jFrmMenuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBntIngresoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntIngreso;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblContrasenia;
    private javax.swing.JLabel jLblImagenFondo;
    private javax.swing.JLabel jLblUsuario;
    private javax.swing.JPanel jPanelIngreso;
    private javax.swing.JPasswordField jTxtContrasenia;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables

}
