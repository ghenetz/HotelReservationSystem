package Entities;

import Entities.Hotel;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-28T11:33:14")
@StaticMetamodel(Hotel_features.class)
public class Hotel_features_ { 

    public static volatile SingularAttribute<Hotel_features, String> feature_type;
    public static volatile SingularAttribute<Hotel_features, String> discription;
    public static volatile ListAttribute<Hotel_features, Hotel> hotels;
    public static volatile SingularAttribute<Hotel_features, Long> id;

}