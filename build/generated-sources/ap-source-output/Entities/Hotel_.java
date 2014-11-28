package Entities;

import Entities.Hotel_features;
import Entities.Room;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-28T11:33:14")
@StaticMetamodel(Hotel.class)
public class Hotel_ { 

    public static volatile SingularAttribute<Hotel, String> stateN;
    public static volatile ListAttribute<Hotel, Hotel_features> features;
    public static volatile SingularAttribute<Hotel, String> zipCode;
    public static volatile ListAttribute<Hotel, Room> rooms;
    public static volatile SingularAttribute<Hotel, String> city;
    public static volatile SingularAttribute<Hotel, String> phone;
    public static volatile SingularAttribute<Hotel, String> street;
    public static volatile SingularAttribute<Hotel, String> name;
    public static volatile SingularAttribute<Hotel, Long> id;
    public static volatile SingularAttribute<Hotel, String> hotel_No;

}