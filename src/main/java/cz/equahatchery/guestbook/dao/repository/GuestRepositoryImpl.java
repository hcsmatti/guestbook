package cz.equahatchery.guestbook.dao.repository;

import cz.equahatchery.guestbook.dao.entity.GuestEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Guest Repository specific implementation
 *
 * @author Michal Materna
 */
@Component
public class GuestRepositoryImpl implements GuestRepository {

        // Injected database connection:
    @PersistenceContext 
    private EntityManager em;
 
    // Stores a new guest:
    @Transactional
    @Override
    public void save(GuestEntity guest) {
        em.persist(guest);
    }
 
    // Retrieves all the guests:
    @Override
    public List<GuestEntity> getAllGuests() {
    	TypedQuery<GuestEntity> query =  em.createQuery(
            "SELECT g FROM GuestEntity g ORDER BY g.time DESC", GuestEntity.class);
    	return query.getResultList();
    }
    
}
