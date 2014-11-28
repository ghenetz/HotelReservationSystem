package Entities;

import Entities.Hotel;
import Entities.RoomBooking;
import Entities.Room_fetures;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-28T11:33:14")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile ListAttribute<Room, RoomBooking> roomBookings;
    public static volatile SingularAttribute<Room, Double> price;
    public static volatile SingularAttribute<Room, String> smoking;
    public static volatile SingularAttribute<Room, Hotel> hotel;
    public static volatile SingularAttribute<Room, String> room_No;
    public static volatile SingularAttribute<Room, Long> id;
    public static volatile SingularAttribute<Room, String> type;
    public static volatile ListAttribute<Room, Room_fetures> fetures;

}