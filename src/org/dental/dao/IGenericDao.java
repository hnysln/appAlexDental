package org.dental.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Henry Salinas A.
 * @param <E>
 * @param <PK>
 */
public interface IGenericDao<E, PK extends Serializable> {

    public PK save(E object) throws Exception;

    public void update(E object) throws Exception;

    public void delete(E object) throws Exception;

    public void saveOrUpdate(E object) throws Exception;

    public E findById(PK idObject) throws Exception;

    public List<E> findByAttribute(String query) throws Exception;

}
