package Entities;

import Entities.Room;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-28T11:33:14")
@StaticMetamodel(RoomBooking.class)
public class RoomBooking_ { 

    public static volatile SingularAttribute<RoomBooking, Date> dateTo;
    public static volatile SingularAttribute<RoomBooking, Long> id;
    public static volatile SingularAttribute<RoomBooking, Date> dateFrom;
    public static volatile SingularAttribute<RoomBooking, Room> room;
    public static volatile SingularAttribute<RoomBooking, String> no_Of_people;

}