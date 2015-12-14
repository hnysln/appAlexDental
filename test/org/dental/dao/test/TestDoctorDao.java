/**
 * TestDoctorDao.java
 * 07/12/2015
 */
package org.dental.dao.test;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.log4j.Logger;
import org.dental.dao.IDoctor;
import org.dental.dao.implementacion.IDoctorImple;
import org.dental.entidades.Doctor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
public class TestDoctorDao {

    private final static Logger LOG = Logger.getLogger(TestDoctorDao.class);
    private IDoctor doctorDao = null;
    Doctor entidadDoctor = null;

    @Before
    public void before() {
        doctorDao = new IDoctorImple();

        entidadDoctor = new Doctor();
        entidadDoctor.setApellidosdoctor("SALINAS");
        entidadDoctor.setCelulardoctor("0986928575");
        entidadDoctor.setFecharegistro(new Date());
        entidadDoctor.setIdentificaciondoctor("0001721788642");
        entidadDoctor.setMaildoctor("vhsa_17217@hotmail.com");
        entidadDoctor.setNombresdoctor("HENRY");
        entidadDoctor.setTelefonodoctor("023595229");
    }

    @Test
    public void guardarRegistro() {
        try {
            Long pk = null;
            pk = doctorDao.save(entidadDoctor);
            Assert.assertNotNull(pk);
        } catch (Exception e) {
            LOG.error(e);
        }
    }

    @Test
    public void pkDiferente() {
        try {
            Long pk1 = null;
            pk1 = doctorDao.save(entidadDoctor);
            Long pk2 = null;
            pk2 = doctorDao.save(entidadDoctor);
            Assert.assertNotSame(pk1, pk2);
        } catch (Exception e) {
            LOG.error(e);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void guadarNull() throws Exception {
        doctorDao.save(null);
    }

    @Test
    public void insertarDoctoresCargaTest() {
        //IDoctor doctorD = new IDoctorImple();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 30; i++) {
            Runnable worker = new TestDoctorDaoRunnable(doctorDao, entidadDoctor);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }

    }

}
