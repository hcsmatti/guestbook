/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.equahatchery.guestbook.dao.repository;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Criteria;
import org.springframework.transaction.annotation.Transactional;

/**
 * Base for specific intity repositories, not needed with one entity, but handy
 * with more then one :)
 *
 * @author HCS
 */
public abstract class RepositoryBase<T extends Serializable> implements Repository<T> {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
    EntityManager em = emf.createEntityManager();

    @Transactional
    @Override
    public final void save(T entity) {
        em.persist(entity);
        em.flush();
    }

    @Transactional
    @Override
    public final void update(T entity) {
        em.merge(entity);
        em.flush();
    }

    @Transactional(readOnly = true)
    @Override
    public final T get(Class<T> clazz, long id) {
        return (T) em.getReference(clazz, id);
    }

    @Transactional
    @Override
    public final void delete(T entity) {
    }
    
    @Transactional(readOnly = true)
    @Override
    public final List<T> list(Class<T> clazz) {
        final Criteria criteria = (Criteria) em.getCriteriaBuilder();
        return criteria.list();
    }

   
}
