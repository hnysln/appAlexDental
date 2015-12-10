/**
 * DatosSesion.java
 * 09/12/2015
 */
package org.dental.beans;

import java.io.Serializable;
import org.dental.entidades.Doctor;
import org.dental.entidades.Paciente;
import org.dental.entidades.Usuario;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
public class DatosSesion implements Serializable {

    private Paciente pacienteSesion;
    private Doctor doctorSesion;
    private Usuario usuarioSesion;

    public Paciente getPacienteSesion() {
        return pacienteSesion;
    }

    public void setPacienteSesion(Paciente pacienteSesion) {
        this.pacienteSesion = pacienteSesion;
    }

    public Doctor getDoctorSesion() {
        return doctorSesion;
    }

    public void setDoctorSesion(Doctor doctorSesion) {
        this.doctorSesion = doctorSesion;
    }

    public Usuario getUsuarioSesion() {
        return usuarioSesion;
    }

    public void setUsuarioSesion(Usuario usuarioSesion) {
        this.usuarioSesion = usuarioSesion;
    }

}
