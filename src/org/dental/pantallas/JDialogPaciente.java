/**
 * JDialogPaciente.java
 * 22/11/2015
 */
package org.dental.pantallas;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import org.dental.constantes.ConstantesURLS;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
public class JDialogPaciente extends javax.swing.JDialog {

    private static final Integer ANCHO_PANTALLA = 850;
    private static final Integer ALTO_PANTALLA = 500;
    private final static Dimension SCREEN_SIZE = new Dimension(ANCHO_PANTALLA, ALTO_PANTALLA);

    /**
     * Creates new form JDialogPaciente
     *
     * @param parent
     * @param modal
     */
    public JDialogPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.pack();
        ImageIcon iconoVentana = new ImageIcon(getClass().getResource(ConstantesURLS.RUTA_IMAGEN_FONDO_SECUNDARIO));
        Image imagen = iconoVentana.getImage().getScaledInstance((SCREEN_SIZE.width), (SCREEN_SIZE.height), Image.SCALE_AREA_AVERAGING);
        jLblFondo.setIcon(new ImageIcon(imagen));
        jLblFondo.setSize(SCREEN_SIZE);
        this.setSize(SCREEN_SIZE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPacientes = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtNumIdent = new javax.swing.JTextField();
        jTxtPrimerApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTxtSegundoNombre = new javax.swing.JTextField();
        jTxtSegundoApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtDireccion = new javax.swing.JTextField();
        jTxtPrimerNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxtCorreoElect = new javax.swing.JTextField();
        jTxtCelular = new javax.swing.JTextField();
        jTxtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLayeredPacientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingreso Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel1.setText("Número de identificación:");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("INFORMACIÓN PERSONAL");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("INFORMACIÓN CONTACTO");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("INFORMACIÓN DEMOGRÁFICA");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel5.setText("Primero Nombre:");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel6.setText("Primer Apellido:");

        jTxtNumIdent.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTxtNumIdent.setEnabled(false);

        jTxtPrimerApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTxtPrimerApellido.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel7.setText("Segundo Nombre:");

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel8.setText("Segundo Apellido:");

        jTxtSegundoNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTxtSegundoNombre.setEnabled(false);

        jTxtSegundoApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTxtSegundoApellido.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel9.setText("Dirección:");

        jTxtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTxtDireccion.setEnabled(false);

        jTxtPrimerNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTxtPrimerNombre.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel10.setText("Teléfono:");

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel11.setText("Celular:");

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel12.setText("Correo:");

        jTxtCorreoElect.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTxtCorreoElect.setEnabled(false);

        jTxtCelular.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTxtCelular.setEnabled(false);

        jTxtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTxtTelefono.setEnabled(false);

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");

        jLayeredPacientes.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jTxtNumIdent, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jTxtPrimerApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jTxtSegundoNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jTxtSegundoApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jTxtDireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jTxtPrimerNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jTxtCorreoElect, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jTxtCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(jTxtTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(btnGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPacientes.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPacientesLayout = new javax.swing.GroupLayout(jLayeredPacientes);
        jLayeredPacientes.setLayout(jLayeredPacientesLayout);
        jLayeredPacientesLayout.setHorizontalGroup(
            jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPacientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(216, 216, 216))
            .addGroup(jLayeredPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPacientesLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPacientesLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPacientesLayout.createSequentialGroup()
                                    .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel12))
                                    .addGap(60, 60, 60)
                                    .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jLayeredPacientesLayout.createSequentialGroup()
                                            .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jLayeredPacientesLayout.createSequentialGroup()
                                            .addComponent(jTxtCorreoElect, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPacientesLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTxtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jLayeredPacientesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jTxtNumIdent, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jLayeredPacientesLayout.setVerticalGroup(
            jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPacientesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNumIdent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPacientesLayout.createSequentialGroup()
                        .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTxtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(jLayeredPacientesLayout.createSequentialGroup()
                        .addComponent(jTxtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCorreoElect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        getContentPane().add(jLayeredPacientes);
        jLayeredPacientes.setBounds(30, 30, 790, 440);
        jLayeredPacientes.getAccessibleContext().setAccessibleName("Ingreso Pacientes");

        jLblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/FondoSecundario.jpg"))); // NOI18N
        getContentPane().add(jLblFondo);
        jLblFondo.setBounds(0, 0, 1520, 506);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JDialogPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogPaciente dialog = new JDialogPaciente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPacientes;
    private javax.swing.JLabel jLblFondo;
    private javax.swing.JTextField jTxtCelular;
    private javax.swing.JTextField jTxtCorreoElect;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtNumIdent;
    private javax.swing.JTextField jTxtPrimerApellido;
    private javax.swing.JTextField jTxtPrimerNombre;
    private javax.swing.JTextField jTxtSegundoApellido;
    private javax.swing.JTextField jTxtSegundoNombre;
    private javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
