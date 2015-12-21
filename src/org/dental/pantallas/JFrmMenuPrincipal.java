/**
 * JFrmMenuPrincipal.java
 * 09/12/2015
 */
package org.dental.pantallas;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.dental.constantes.Constantes;
import org.dental.constantes.ConstantesMenuPrincipal;
import org.dental.constantes.ConstantesTipoLetra;
import org.dental.constantes.ConstantesURLS;
import org.dental.utilitarios.Util;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
public class JFrmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Para la posici&oacute;n de los jPanelGroup
     */
    private final Integer POSICION_X = 100;
    private final Integer POSICION_Y = 300;

    /**
     * Para el tamanio de la letra de cada uno de los botones internos que tenga
     * un Panel
     */
    private final Integer TAMANIO_LETRA_12 = 12;
    private final Integer TAMANIO_LETRA_15 = 15;

    /**
     * Creates new form JFrmMenuPrincipal
     */
    public JFrmMenuPrincipal() {
        initComponents();
        initJpanelGroups();
        Dimension screenSize = Constantes.dimensionScreen(getGraphicsConfiguration());
        this.setSize(screenSize.width, screenSize.height);
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICONO_HOME)).getImage());
    }

    private void initJpanelGroups() {
        jPanelGrupoUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grupo Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, 16), new java.awt.Color(0, 153, 153)));
        jPanelGrupoUsuarios.setVisible(false);

        jPanelPacientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, 16), new java.awt.Color(0, 153, 153)));
        jPanelPacientes.setVisible(false);

        jPanelExamen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, 16), new java.awt.Color(0, 153, 153)));
        jPanelExamen.setVisible(false);

        jPanelExaminadores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examinadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, 16), new java.awt.Color(0, 153, 153)));
        jPanelExaminadores.setVisible(false);
//
//        jPanelMantenimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mantenimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font(ConstantesTipoLetra.CENTURY_GOTHIC_TYPE, ConstantesTipoLetra.CENTURY_GOTHIC_STYLE, ConstantesTipoLetra.CENTURY_GOTHIC_SIZE)));
//        jPanelMantenimiento.setVisible(false);
//
//        jPanelReportes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reportes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font(ConstantesTipoLetra.CENTURY_GOTHIC_TYPE, ConstantesTipoLetra.CENTURY_GOTHIC_STYLE, ConstantesTipoLetra.CENTURY_GOTHIC_SIZE)));
//        jPanelReportes.setVisible(false);
    }

    private void changeJpanelGroups(ConstantesMenuPrincipal.opcionesSubMenu subMenu) {
        switch (subMenu) {
            case GRUPO_USUARIOS:
                jPanelGrupoUsuarios.setLocation(POSICION_X, POSICION_Y);
                jPanelGrupoUsuarios.setVisible(true);
                jPanelPacientes.setVisible(false);
                jPanelExamen.setVisible(false);
                jPanelExaminadores.setVisible(false);
                break;
            case PACIENTES:
                jPanelPacientes.setLocation(POSICION_X, POSICION_Y);
                jPanelPacientes.setVisible(true);
                jPanelGrupoUsuarios.setVisible(false);
                jPanelExamen.setVisible(false);
                jPanelExaminadores.setVisible(false);
                break;
            case EXAMINADORES:
                jPanelExaminadores.setLocation(POSICION_X, POSICION_Y);
                jPanelExaminadores.setVisible(true);
                jPanelGrupoUsuarios.setVisible(false);
                jPanelExamen.setVisible(false);
                jPanelPacientes.setVisible(false);
                break;
            case EXAMEN:
                jPanelExamen.setLocation(POSICION_X, POSICION_Y);
                jPanelExamen.setVisible(true);
                jPanelGrupoUsuarios.setVisible(false);
                jPanelPacientes.setVisible(false);
                jPanelExaminadores.setVisible(false);
                break;

            case REPORTES:
                jPanelExamen.setVisible(false);
                jPanelGrupoUsuarios.setVisible(false);
                jPanelPacientes.setVisible(false);
                jPanelExaminadores.setVisible(false);
                break;

            case MANTENIMIENTO:
                jPanelExamen.setVisible(false);
                jPanelGrupoUsuarios.setVisible(false);
                jPanelPacientes.setVisible(false);
                jPanelExaminadores.setVisible(false);
                break;

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBntUsuarios = new javax.swing.JLabel();
        jPanelGrupoUsuarios = new javax.swing.JLayeredPane();
        jBntAgregarUsuario = new javax.swing.JLabel();
        jBntConsultarUsuario = new javax.swing.JLabel();
        jBntPacientes = new javax.swing.JLabel();
        jPanelPacientes = new javax.swing.JLayeredPane();
        jBntNuevoPaciente = new javax.swing.JLabel();
        jBntModificarPaciente = new javax.swing.JLabel();
        jBntExaminadores = new javax.swing.JLabel();
        jBntExamen = new javax.swing.JLabel();
        jbntReportes = new javax.swing.JLabel();
        jbntMantenimiento = new javax.swing.JLabel();
        jbntSalir = new javax.swing.JLabel();
        jPanelExamen = new javax.swing.JLayeredPane();
        jBntCrearExamen = new javax.swing.JLabel();
        jBntOtraCosaAlaja = new javax.swing.JLabel();
        jBntAlgoAlaja = new javax.swing.JLabel();
        jPanelExaminadores = new javax.swing.JLayeredPane();
        jBntNuevoExaminador = new javax.swing.JLabel();
        jBntModificarExaminador = new javax.swing.JLabel();
        jBntBuscarExaminador = new javax.swing.JLabel();
        jLblImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jBntUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBntUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/grupoUsuarios_64x64.png"))); // NOI18N
        jBntUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntUsuarios.setMaximumSize(new java.awt.Dimension(128, 128));
        jBntUsuarios.setMinimumSize(new java.awt.Dimension(128, 128));
        jBntUsuarios.setPreferredSize(new java.awt.Dimension(128, 128));
        jBntUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntUsuariosMouseExited(evt);
            }
        });
        getContentPane().add(jBntUsuarios);
        jBntUsuarios.setBounds(330, 70, 72, 72);

        jPanelGrupoUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 0, 14), new java.awt.Color(0, 153, 153))); // NOI18N

        jBntAgregarUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBntAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Usuarios_24x24.png"))); // NOI18N
        jBntAgregarUsuario.setText("Estudiantes");
        jBntAgregarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntAgregarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntAgregarUsuarioMouseExited(evt);
            }
        });
        jPanelGrupoUsuarios.add(jBntAgregarUsuario);
        jBntAgregarUsuario.setBounds(30, 40, 140, 30);

        jBntConsultarUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBntConsultarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Usuarios_24x24.png"))); // NOI18N
        jBntConsultarUsuario.setText("Doctores");
        jBntConsultarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntConsultarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntConsultarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntConsultarUsuarioMouseExited(evt);
            }
        });
        jPanelGrupoUsuarios.add(jBntConsultarUsuario);
        jBntConsultarUsuario.setBounds(30, 70, 140, 30);

        getContentPane().add(jPanelGrupoUsuarios);
        jPanelGrupoUsuarios.setBounds(60, 520, 340, 170);

        jBntPacientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBntPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Pacientes_48x48.png"))); // NOI18N
        jBntPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntPacientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntPacientesMouseExited(evt);
            }
        });
        getContentPane().add(jBntPacientes);
        jBntPacientes.setBounds(480, 130, 64, 64);

        jPanelPacientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 0, 14), new java.awt.Color(0, 153, 153))); // NOI18N

        jBntNuevoPaciente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBntNuevoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/PacienteNuevo_24x24.png"))); // NOI18N
        jBntNuevoPaciente.setText("Nuevo");
        jBntNuevoPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntNuevoPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntNuevoPacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntNuevoPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntNuevoPacienteMouseExited(evt);
            }
        });
        jPanelPacientes.add(jBntNuevoPaciente);
        jBntNuevoPaciente.setBounds(30, 30, 120, 30);

        jBntModificarPaciente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBntModificarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/PacienteNuevo_24x24.png"))); // NOI18N
        jBntModificarPaciente.setText("Modificar");
        jBntModificarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntModificarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntModificarPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntModificarPacienteMouseExited(evt);
            }
        });
        jPanelPacientes.add(jBntModificarPaciente);
        jBntModificarPaciente.setBounds(30, 60, 120, 30);

        getContentPane().add(jPanelPacientes);
        jPanelPacientes.setBounds(410, 520, 340, 170);

        jBntExaminadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Examinador_64x64.png"))); // NOI18N
        jBntExaminadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntExaminadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntExaminadoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntExaminadoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntExaminadoresMouseExited(evt);
            }
        });
        getContentPane().add(jBntExaminadores);
        jBntExaminadores.setBounds(610, 190, 64, 64);

        jBntExamen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Examen_64x64.png"))); // NOI18N
        jBntExamen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntExamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntExamenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntExamenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntExamenMouseExited(evt);
            }
        });
        getContentPane().add(jBntExamen);
        jBntExamen.setBounds(760, 260, 72, 72);

        jbntReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Reportes_64x64.png"))); // NOI18N
        jbntReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbntReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbntReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbntReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbntReportesMouseExited(evt);
            }
        });
        getContentPane().add(jbntReportes);
        jbntReportes.setBounds(910, 355, 72, 72);

        jbntMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Mantenimiento_64x64.png"))); // NOI18N
        jbntMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbntMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbntMantenimientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbntMantenimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbntMantenimientoMouseExited(evt);
            }
        });
        getContentPane().add(jbntMantenimiento);
        jbntMantenimiento.setBounds(1040, 450, 72, 72);

        jbntSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Salir_64x64.png"))); // NOI18N
        jbntSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbntSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbntSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbntSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbntSalirMouseExited(evt);
            }
        });
        getContentPane().add(jbntSalir);
        jbntSalir.setBounds(1140, 560, 70, 70);

        jPanelExamen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 0, 14), new java.awt.Color(0, 153, 153))); // NOI18N

        jBntCrearExamen.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBntCrearExamen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Examen-icon_24x24.png"))); // NOI18N
        jBntCrearExamen.setText("Nueva Examen");
        jBntCrearExamen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntCrearExamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntCrearExamenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntCrearExamenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntCrearExamenMouseExited(evt);
            }
        });
        jPanelExamen.add(jBntCrearExamen);
        jBntCrearExamen.setBounds(30, 40, 160, 30);

        jBntOtraCosaAlaja.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBntOtraCosaAlaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Examen-icon_24x24.png"))); // NOI18N
        jBntOtraCosaAlaja.setText("Otra cosa alaja");
        jBntOtraCosaAlaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntOtraCosaAlaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntOtraCosaAlajaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntOtraCosaAlajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntOtraCosaAlajaMouseExited(evt);
            }
        });
        jPanelExamen.add(jBntOtraCosaAlaja);
        jBntOtraCosaAlaja.setBounds(30, 100, 160, 30);

        jBntAlgoAlaja.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBntAlgoAlaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Examen-icon_24x24.png"))); // NOI18N
        jBntAlgoAlaja.setText("Algo alaja");
        jBntAlgoAlaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntAlgoAlaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntAlgoAlajaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntAlgoAlajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntAlgoAlajaMouseExited(evt);
            }
        });
        jPanelExamen.add(jBntAlgoAlaja);
        jBntAlgoAlaja.setBounds(30, 70, 180, 30);

        getContentPane().add(jPanelExamen);
        jPanelExamen.setBounds(410, 340, 340, 170);

        jPanelExaminadores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Examinadores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Light", 0, 14), new java.awt.Color(0, 153, 153))); // NOI18N

        jBntNuevoExaminador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBntNuevoExaminador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Examinador_16x16.png"))); // NOI18N
        jBntNuevoExaminador.setText("Nuevo");
        jBntNuevoExaminador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntNuevoExaminador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntNuevoExaminadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntNuevoExaminadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntNuevoExaminadorMouseExited(evt);
            }
        });
        jPanelExaminadores.add(jBntNuevoExaminador);
        jBntNuevoExaminador.setBounds(30, 40, 160, 30);

        jBntModificarExaminador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBntModificarExaminador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Examinador_16x16.png"))); // NOI18N
        jBntModificarExaminador.setText("Modificar");
        jBntModificarExaminador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntModificarExaminador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntModificarExaminadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntModificarExaminadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntModificarExaminadorMouseExited(evt);
            }
        });
        jPanelExaminadores.add(jBntModificarExaminador);
        jBntModificarExaminador.setBounds(30, 70, 150, 30);

        jBntBuscarExaminador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jBntBuscarExaminador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/Examinador_16x16.png"))); // NOI18N
        jBntBuscarExaminador.setText("Buscar");
        jBntBuscarExaminador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBntBuscarExaminador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBntBuscarExaminadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBntBuscarExaminadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBntBuscarExaminadorMouseExited(evt);
            }
        });
        jPanelExaminadores.add(jBntBuscarExaminador);
        jBntBuscarExaminador.setBounds(30, 100, 160, 30);

        getContentPane().add(jPanelExaminadores);
        jPanelExaminadores.setBounds(60, 340, 340, 170);

        jLblImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/dental/imagenes/FondoPrincipal.png"))); // NOI18N
        jLblImagenFondo.setPreferredSize(null);
        getContentPane().add(jLblImagenFondo);
        jLblImagenFondo.setBounds(0, 0, 1920, 880);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBntUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntUsuariosMouseClicked
        changeJpanelGroups(ConstantesMenuPrincipal.opcionesSubMenu.GRUPO_USUARIOS);
    }//GEN-LAST:event_jBntUsuariosMouseClicked

    private void jBntUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntUsuariosMouseEntered
        jBntUsuarios.setFont(new java.awt.Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, ConstantesTipoLetra.TAMANIO_LETRA_MENU));
        jBntUsuarios.setForeground(new java.awt.Color(ConstantesTipoLetra.ColorLetraToolTipTextMenu.RED.toInt(), ConstantesTipoLetra.ColorLetraToolTipTextMenu.GREEN.toInt(), ConstantesTipoLetra.ColorLetraToolTipTextMenu.BLUE.toInt()));
        jBntUsuarios.setText("Usuarios");
        jBntUsuarios.setBounds(290, 40, 250, 128);
        jBntUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_GRUPO_USUARIOS_96X96)));
    }//GEN-LAST:event_jBntUsuariosMouseEntered

    private void jBntUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntUsuariosMouseExited
        jBntUsuarios.setText("");
        jBntUsuarios.setBounds(330, 70, 72, 72);
        jBntUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_GRUPO_USUARIOS_64X64)));
    }//GEN-LAST:event_jBntUsuariosMouseExited

    private void jBntPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntPacientesMouseClicked
        changeJpanelGroups(ConstantesMenuPrincipal.opcionesSubMenu.PACIENTES);
    }//GEN-LAST:event_jBntPacientesMouseClicked

    private void jBntPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntPacientesMouseEntered
        jBntPacientes.setFont(new java.awt.Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, ConstantesTipoLetra.TAMANIO_LETRA_MENU));
        jBntPacientes.setForeground(new java.awt.Color(ConstantesTipoLetra.ColorLetraToolTipTextMenu.RED.toInt(), ConstantesTipoLetra.ColorLetraToolTipTextMenu.GREEN.toInt(), ConstantesTipoLetra.ColorLetraToolTipTextMenu.BLUE.toInt()));
        jBntPacientes.setText("Pacientes");
        jBntPacientes.setBounds(440, 100, 270, 128);
        jBntPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_PACIENTES_64X64)));
    }//GEN-LAST:event_jBntPacientesMouseEntered

    private void jBntPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntPacientesMouseExited
        jBntPacientes.setText("");
        jBntPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_PACIENTES_48X48)));
        jBntPacientes.setBounds(480, 130, 64, 64);
    }//GEN-LAST:event_jBntPacientesMouseExited

    private void jBntNuevoPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntNuevoPacienteMouseEntered
        jBntNuevoPaciente.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_15));
    }//GEN-LAST:event_jBntNuevoPacienteMouseEntered

    private void jBntNuevoPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntNuevoPacienteMouseExited
        jBntNuevoPaciente.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_12));
    }//GEN-LAST:event_jBntNuevoPacienteMouseExited

    private void jBntModificarPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntModificarPacienteMouseEntered
        jBntModificarPaciente.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_15));
    }//GEN-LAST:event_jBntModificarPacienteMouseEntered

    private void jBntModificarPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntModificarPacienteMouseExited
        jBntModificarPaciente.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_12));
    }//GEN-LAST:event_jBntModificarPacienteMouseExited

    private void jBntNuevoPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntNuevoPacienteMouseClicked
        jBntNuevoPaciente.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_12));
        JDialogPaciente jDialogPaciente = new JDialogPaciente(this, true);
        //jDialogPaciente.setUsuario(usuario);
        jDialogPaciente.setLocationRelativeTo(this);
        jDialogPaciente.setVisible(true);

    }//GEN-LAST:event_jBntNuevoPacienteMouseClicked

    private void jBntExaminadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntExaminadoresMouseClicked
        changeJpanelGroups(ConstantesMenuPrincipal.opcionesSubMenu.EXAMINADORES);
    }//GEN-LAST:event_jBntExaminadoresMouseClicked

    private void jBntExaminadoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntExaminadoresMouseEntered
        jBntExaminadores.setFont(new java.awt.Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, ConstantesTipoLetra.TAMANIO_LETRA_MENU));
        jBntExaminadores.setForeground(new java.awt.Color(ConstantesTipoLetra.ColorLetraToolTipTextMenu.RED.toInt(), ConstantesTipoLetra.ColorLetraToolTipTextMenu.GREEN.toInt(), ConstantesTipoLetra.ColorLetraToolTipTextMenu.BLUE.toInt()));
        jBntExaminadores.setText("Índice de placa");
        jBntExaminadores.setBounds(590, 170, 350, 96);
        jBntExaminadores.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_EXAMINADOR_96X96)));
    }//GEN-LAST:event_jBntExaminadoresMouseEntered

    private void jBntExaminadoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntExaminadoresMouseExited
        jBntExaminadores.setText("");
        jBntExaminadores.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_EXAMINADOR_64X64))); // NOI18N
        jBntExaminadores.setBounds(610, 190, 64, 64);
    }//GEN-LAST:event_jBntExaminadoresMouseExited

    private void jBntExamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntExamenMouseClicked
        changeJpanelGroups(ConstantesMenuPrincipal.opcionesSubMenu.EXAMEN);
    }//GEN-LAST:event_jBntExamenMouseClicked

    private void jBntExamenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntExamenMouseEntered
        jBntExamen.setFont(new java.awt.Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, ConstantesTipoLetra.TAMANIO_LETRA_MENU));
        jBntExamen.setText("P.S.R.");
        jBntExamen.setBounds(740, 239, 300, 128);
        jBntExamen.setForeground(new java.awt.Color(255, 255, 255));
        jBntExamen.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_EXAMEN_96X96)));
    }//GEN-LAST:event_jBntExamenMouseEntered

    private void jBntExamenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntExamenMouseExited
        jBntExamen.setText("");
        jBntExamen.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_EXAMEN_64X64)));
        jBntExamen.setBounds(760, 260, 72, 72);
    }//GEN-LAST:event_jBntExamenMouseExited

    private void jbntReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbntReportesMouseClicked
        changeJpanelGroups(ConstantesMenuPrincipal.opcionesSubMenu.REPORTES);
    }//GEN-LAST:event_jbntReportesMouseClicked

    private void jbntReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbntReportesMouseEntered
        jbntReportes.setFont(new java.awt.Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, ConstantesTipoLetra.TAMANIO_LETRA_MENU));
        jbntReportes.setForeground(new java.awt.Color(ConstantesTipoLetra.ColorLetraToolTipTextMenu.RED.toInt(), ConstantesTipoLetra.ColorLetraToolTipTextMenu.GREEN.toInt(), ConstantesTipoLetra.ColorLetraToolTipTextMenu.BLUE.toInt()));
        jbntReportes.setText("Periodontograma");
        jbntReportes.setBounds(890, 320, 350, 128);
        jbntReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_REPORTES_96X96)));
    }//GEN-LAST:event_jbntReportesMouseEntered

    private void jbntReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbntReportesMouseExited
        jbntReportes.setText("");
        jbntReportes.setBounds(910, 355, 72, 72);
        jbntReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_REPORTES_64X64)));
    }//GEN-LAST:event_jbntReportesMouseExited

    private void jbntMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbntMantenimientoMouseClicked
        changeJpanelGroups(ConstantesMenuPrincipal.opcionesSubMenu.MANTENIMIENTO);
    }//GEN-LAST:event_jbntMantenimientoMouseClicked

    private void jbntMantenimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbntMantenimientoMouseEntered
        jbntMantenimiento.setFont(new java.awt.Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, ConstantesTipoLetra.TAMANIO_LETRA_MENU));
        jbntMantenimiento.setForeground(new java.awt.Color(ConstantesTipoLetra.ColorLetraToolTipTextMenu.RED.toInt(), ConstantesTipoLetra.ColorLetraToolTipTextMenu.GREEN.toInt(), ConstantesTipoLetra.ColorLetraToolTipTextMenu.BLUE.toInt()));
        jbntMantenimiento.setText("Mantenimiento");
        jbntMantenimiento.setBounds(1015, 415, 320, 128);
        jbntMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_MANTENIMIENTO_96X96)));
    }//GEN-LAST:event_jbntMantenimientoMouseEntered

    private void jbntMantenimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbntMantenimientoMouseExited
        jbntMantenimiento.setText("");
        jbntMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_MANTENIMIENTO_64X64)));
        jbntMantenimiento.setBounds(1040, 450, 72, 72);
    }//GEN-LAST:event_jbntMantenimientoMouseExited

    private void jbntSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbntSalirMouseClicked
        closeWindow();
    }//GEN-LAST:event_jbntSalirMouseClicked

    private void jbntSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbntSalirMouseEntered
        jbntSalir.setFont(new java.awt.Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, ConstantesTipoLetra.TAMANIO_LETRA_MENU));
        jbntSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbntSalir.setText("Salir");
        jbntSalir.setBounds(1110, 520, 250, 128);
        jbntSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_SALIR_128X128)));
    }//GEN-LAST:event_jbntSalirMouseEntered

    private void jbntSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbntSalirMouseExited
        jbntSalir.setText("");
        jbntSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_SALIR_64X64)));
        jbntSalir.setBounds(1140, 560, 64, 64);
    }//GEN-LAST:event_jbntSalirMouseExited

    private void jBntCrearExamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntCrearExamenMouseClicked

    }//GEN-LAST:event_jBntCrearExamenMouseClicked

    private void jBntOtraCosaAlajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntOtraCosaAlajaMouseClicked

    }//GEN-LAST:event_jBntOtraCosaAlajaMouseClicked

    private void jBntAlgoAlajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntAlgoAlajaMouseClicked

    }//GEN-LAST:event_jBntAlgoAlajaMouseClicked

    private void jBntAgregarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntAgregarUsuarioMouseEntered
        jBntAgregarUsuario.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_15));
    }//GEN-LAST:event_jBntAgregarUsuarioMouseEntered

    private void jBntAgregarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntAgregarUsuarioMouseExited
        jBntAgregarUsuario.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_12));
    }//GEN-LAST:event_jBntAgregarUsuarioMouseExited

    private void jBntConsultarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntConsultarUsuarioMouseEntered
        jBntConsultarUsuario.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_15));
    }//GEN-LAST:event_jBntConsultarUsuarioMouseEntered

    private void jBntConsultarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntConsultarUsuarioMouseExited
        jBntConsultarUsuario.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_12));
    }//GEN-LAST:event_jBntConsultarUsuarioMouseExited

    private void jBntCrearExamenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntCrearExamenMouseEntered
        jBntCrearExamen.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_15));
    }//GEN-LAST:event_jBntCrearExamenMouseEntered

    private void jBntCrearExamenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntCrearExamenMouseExited
        jBntCrearExamen.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_12));
    }//GEN-LAST:event_jBntCrearExamenMouseExited

    private void jBntAlgoAlajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntAlgoAlajaMouseEntered
        jBntAlgoAlaja.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_15));
    }//GEN-LAST:event_jBntAlgoAlajaMouseEntered

    private void jBntAlgoAlajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntAlgoAlajaMouseExited
        jBntAlgoAlaja.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_12));
    }//GEN-LAST:event_jBntAlgoAlajaMouseExited

    private void jBntOtraCosaAlajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntOtraCosaAlajaMouseEntered
        jBntOtraCosaAlaja.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_15));
    }//GEN-LAST:event_jBntOtraCosaAlajaMouseEntered

    private void jBntOtraCosaAlajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntOtraCosaAlajaMouseExited
        jBntOtraCosaAlaja.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_12));
    }//GEN-LAST:event_jBntOtraCosaAlajaMouseExited

    private void jBntNuevoExaminadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntNuevoExaminadorMouseClicked
    }//GEN-LAST:event_jBntNuevoExaminadorMouseClicked

    private void jBntModificarExaminadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntModificarExaminadorMouseClicked
    }//GEN-LAST:event_jBntModificarExaminadorMouseClicked

    private void jBntBuscarExaminadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntBuscarExaminadorMouseClicked

    }//GEN-LAST:event_jBntBuscarExaminadorMouseClicked

    private void jBntNuevoExaminadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntNuevoExaminadorMouseEntered
        jBntNuevoExaminador.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_15));
    }//GEN-LAST:event_jBntNuevoExaminadorMouseEntered

    private void jBntNuevoExaminadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntNuevoExaminadorMouseExited
        jBntNuevoExaminador.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_12));
    }//GEN-LAST:event_jBntNuevoExaminadorMouseExited

    private void jBntModificarExaminadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntModificarExaminadorMouseEntered
        jBntModificarExaminador.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_15));
    }//GEN-LAST:event_jBntModificarExaminadorMouseEntered

    private void jBntModificarExaminadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntModificarExaminadorMouseExited
        jBntModificarExaminador.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_12));
    }//GEN-LAST:event_jBntModificarExaminadorMouseExited

    private void jBntBuscarExaminadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntBuscarExaminadorMouseEntered
        jBntBuscarExaminador.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_15));
    }//GEN-LAST:event_jBntBuscarExaminadorMouseEntered

    private void jBntBuscarExaminadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBntBuscarExaminadorMouseExited
        jBntBuscarExaminador.setFont(new java.awt.Font("Century Gothic", 0, TAMANIO_LETRA_12));
    }//GEN-LAST:event_jBntBuscarExaminadorMouseExited

    private void closeWindow() {
        int confirm = JOptionPane.showOptionDialog(this,
                Util.mensajeHTMLShowOptionPanel("¿Est&aacute; seguro que desea cerrar la aplicaci&oacute;n?"),
                "Confirmación de cierre", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, new ImageIcon(getClass().getResource(ConstantesURLS.RUTA_ICON_ALERT_16X16)));
        if (confirm == JOptionPane.OK_OPTION) {
//            UsuarioDao usuarioDaoImplemen = new UsuarioDaoImplemen();
//            try {
//                usuario.setValidacioningreso(false);
//                usuarioDaoImplemen.update(usuario);
//            } catch (Exception ex) {
//                LOG.error(ex);
//            }
            this.dispose();
            System.exit(0);
        }
    }

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
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBntAgregarUsuario;
    private javax.swing.JLabel jBntAlgoAlaja;
    private javax.swing.JLabel jBntBuscarExaminador;
    private javax.swing.JLabel jBntConsultarUsuario;
    private javax.swing.JLabel jBntCrearExamen;
    private javax.swing.JLabel jBntExamen;
    private javax.swing.JLabel jBntExaminadores;
    private javax.swing.JLabel jBntModificarExaminador;
    private javax.swing.JLabel jBntModificarPaciente;
    private javax.swing.JLabel jBntNuevoExaminador;
    private javax.swing.JLabel jBntNuevoPaciente;
    private javax.swing.JLabel jBntOtraCosaAlaja;
    private javax.swing.JLabel jBntPacientes;
    private javax.swing.JLabel jBntUsuarios;
    private javax.swing.JLabel jLblImagenFondo;
    private javax.swing.JLayeredPane jPanelExamen;
    private javax.swing.JLayeredPane jPanelExaminadores;
    private javax.swing.JLayeredPane jPanelGrupoUsuarios;
    private javax.swing.JLayeredPane jPanelPacientes;
    private javax.swing.JLabel jbntMantenimiento;
    private javax.swing.JLabel jbntReportes;
    private javax.swing.JLabel jbntSalir;
    // End of variables declaration//GEN-END:variables
}
