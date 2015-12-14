/**
 * TestDoctorDaoRunnable.java
 * 10/12/2015
 */
package org.dental.dao.test;

import java.util.Date;
import org.apache.log4j.Logger;
import org.dental.dao.IDoctor;
import org.dental.entidades.Doctor;
import org.junit.Assert;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
public class TestDoctorDaoRunnable implements Runnable {

    private static final Logger LOG = Logger.getLogger(TestDoctorDaoRunnable.class);
    private IDoctor doctorDAO;
    private Doctor doctorEnt;

    public TestDoctorDaoRunnable(IDoctor IdoctorDAO, Doctor doctorEntidad) {
        this.doctorDAO = IdoctorDAO;
        this.doctorEnt = doctorEntidad;
    }

    @Override
    public void run() {
        try {
            long inicio = new Date().getTime();
            Long pk = null;
            pk = doctorDAO.save(doctorEnt);
            Assert.assertNotNull(pk);
            long fin = new Date().getTime();
            LOG.info("Tiempo para insertar: " + Thread.currentThread().getName() + " :" + (fin - inicio));
        } catch (Exception e) {
            LOG.error("Error al insertar el registro del doctor", e);
            Assert.fail("Error al insertar el registro del doctor");
        }
    }

}
