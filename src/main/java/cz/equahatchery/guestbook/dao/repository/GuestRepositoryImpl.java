package cz.equahatchery.guestbook.dao.repository;

import cz.equahatchery.guestbook.dao.entity.GuestEntity;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 * Guest Repository specific implementation
 *
 * @author Michal Materna
 */
public class GuestRepositoryImpl extends RepositoryBase<GuestEntity>
        implements GuestRepository {

    /**
     * Find guest by given name
     * @param name name of guest
     * @return true if any guest with given name exists, or false if not
     */
    @Override
    public boolean find(String name) {
        TypedQuery<GuestEntity> query = em.createQuery("SELECT c.Id FROM guests AS c WHERE c.name = :name", GuestEntity.class);
        query.setParameter("name", name);
        final List<GuestEntity> guestList = query.getResultList();

        if (guestList.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
