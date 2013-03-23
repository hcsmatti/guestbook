/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.equahatchery.guestbook.dao.repository;

import java.io.Serializable;
import java.util.List;

/**
 * Basic interface to work with entities
 * @author Michal Materna
 */
public interface Repository<T extends Serializable> {

    void delete(T entity);

    T get(Class<T> clazz, long id);

    List<T> list(Class<T> clazz);

    void saveOrUpdate(T entity);
}
