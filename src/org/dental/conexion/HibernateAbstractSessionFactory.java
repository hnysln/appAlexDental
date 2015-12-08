package org.dental.conexion;

import org.hibernate.SessionFactory;

public class HibernateAbstractSessionFactory {

    protected SessionFactory getSessionFactory() {
        return HibernateUtil.getSessionFactory();
    }
}
