/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;



/**
 *
 * @author gizachew
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Booking implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateFrom;
    @Temporal(TemporalType.DATE)
    private Date dateTo;
    @ManyToOne
    @JoinColumn(name = "room_fk")
    private Room room;
    @ManyToOne
    @JoinColumn(name = "customer_fk")
    private Customer customer;
    private double totalCost;
    //private int no_Of_rooms;
    private String noOfRoom;

    public Booking() {
    }   
    
    public Booking(Date dateFrom, Date dateTo, Room room, Customer customer, double totalCost, String noOfRoom) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.room = room;
        this.customer = customer;
        this.totalCost = totalCost;
        this.noOfRoom = noOfRoom;
    }   

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(String noOfRoom) {
        this.noOfRoom = noOfRoom;
    }    

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }   
    
    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.RoomBooking[ id=" + id + " ]";
    }
    
}

/*
@Entity
public class Booking implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Date dateForm;
    private Date dateTo;
    private int no_Of_peoples;

    public Date getDateForm() {
        return dateForm;
    }

    public void setDateForm(Date dateForm) {
        this.dateForm = dateForm;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public int getNo_Of_peoples() {
        return no_Of_peoples;
    }

    public void setNo_Of_peoples(int no_Of_peoples) {
        this.no_Of_peoples = no_Of_peoples;
    }

    public double getNo_of_rooms() {
        return no_of_rooms;
    }

    public void setNo_of_rooms(double no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }
    private double no_of_rooms;
    //private String hotel_number;
    //private String room_type;
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Booking[ id=" + id + " ]";
    }
    
}*/
