

package Entities;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("customer")
public class Customer extends Account{
    @OneToMany
    private List<RoomBooking> bookings;

    public List<RoomBooking> getBookings() {
        return bookings;
    }

    public void setBookings(List<RoomBooking> bookings) {
        this.bookings = bookings;
    }

 
    
    
}
/*
@Entity
@Inheritance(discriminatorValue="C")
public class Customer extends Account {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Customer[ id=" + id + " ]";
    }
    
}
*/
