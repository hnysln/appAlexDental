/**
 * GenericDaoImplemen.java
 * 07/12/2015
 */
package org.dental.dao.implementacion;

import java.io.Serializable;
import java.util.List;
import org.apache.log4j.Logger;
import org.dental.conexion.HibernateAbstractSessionFactory;
import org.dental.dao.GenericDao;
import org.hibernate.PropertyValueException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 * @param <E>
 * @param <PK>
 */
public class GenericDaoImplemen<E, PK extends Serializable> extends HibernateAbstractSessionFactory implements GenericDao<E, PK> {

    private static final Logger LOG = Logger.getLogger(GenericDaoImplemen.class);

    @Override    
    public PK save(E object) throws Exception {
        Session session = null;
        Transaction transaction = null;
        try {
            session = getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Object pk = session.save(object);
            session.getTransaction().commit();
            return (PK) pk;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            if (e instanceof PropertyValueException) {
                throw new PropertyValueException("Ingrese los datos requeridos.", null, null);
            } else {
                LOG.error("Error al guardar el registro en la bdd", e);
                throw new Exception("Error al guardar el registro en la bdd", e);
            }

        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void update(E object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(E object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveOrUpdate(E object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E findById(PK idObject) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<E> findByAttribute(String query) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
