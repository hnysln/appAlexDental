/**
 * TestDoctorDao.java
 * 07/12/2015
 */
package org.dental.dao.test;

import java.util.Date;
import org.dental.dao.IDoctor;
import org.dental.dao.implementacion.IDoctorImple;
import org.dental.entidades.Doctor;
import org.junit.Test;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
public class TestDoctorDao {

    @Test
    public void guardarRegistro() {
        IDoctor doctor = new IDoctorImple();
        Doctor entidadDoctor = new Doctor();
        entidadDoctor.setApellidosdoctor("SALINAS");
        entidadDoctor.setCelulardoctor("0986928575");
        entidadDoctor.setFecharegistro(new Date());
        entidadDoctor.setIdentificaciondoctor("0001721788642");
        entidadDoctor.setMaildoctor("vhsa_17217@hotmail.com");
        entidadDoctor.setNombresdoctor("HENRY");
        entidadDoctor.setTelefonodoctor("023595229");
        try {
            doctor.save(entidadDoctor);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
