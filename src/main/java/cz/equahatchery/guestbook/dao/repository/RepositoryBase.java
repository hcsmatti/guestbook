/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.equahatchery.guestbook.dao.repository;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HCS
 */
public abstract class RepositoryBase<T extends Serializable> implements Repository<T> {

    
    
    @Transactional
    @Override
    public final void saveOrUpdate(T entity) {
    }

    @Transactional(readOnly = true)
    @Override
    public final T get(Class<T> clazz, long id) {
        return null;
    }

    @Transactional
    @Override
    public final void delete(T entity) {
        
    }

    @Transactional(readOnly = true)
    @Override
    public final List<T> list(Class<T> clazz) {
        
        return null;
    }
}
