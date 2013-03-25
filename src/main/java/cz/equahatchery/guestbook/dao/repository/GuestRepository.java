package cz.equahatchery.guestbook.dao.repository;

import cz.equahatchery.guestbook.dao.entity.GuestEntity;
import java.util.List;


/**
 * Interface for Guest Entity
 * @author Michal Materna
 */
public interface GuestRepository {
   
  public void save(GuestEntity guest); 
  
  public List<GuestEntity> getAllGuests(); 
    
}
