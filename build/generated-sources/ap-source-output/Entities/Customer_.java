package Entities;

import Entities.RoomBooking;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-28T11:33:14")
@StaticMetamodel(Customer.class)
public class Customer_ extends Account_ {

    public static volatile ListAttribute<Customer, RoomBooking> bookings;

}