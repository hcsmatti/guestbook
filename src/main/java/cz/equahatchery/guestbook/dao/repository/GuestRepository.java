package cz.equahatchery.guestbook.dao.repository;

import cz.equahatchery.guestbook.dao.entity.GuestEntity;

/**
 * Interface for Guest Entity
 * @author Michal Materna
 */
public interface GuestRepository extends Repository<GuestEntity> {
   
  public boolean find(String name);  
    
}
