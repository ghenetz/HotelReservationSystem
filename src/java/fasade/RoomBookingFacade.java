/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fasade;

import Entities.Booking;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gizachew
 */
@Stateless
public class RoomBookingFacade extends AbstractFacade<Booking> {
    @PersistenceContext(unitName = "HotelReservationSystemPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RoomBookingFacade() {
        super(Booking.class);
    }
    
}
