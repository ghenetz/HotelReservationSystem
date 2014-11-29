

package Entities;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("customer")
public class Customer extends Account{
    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;

    public Customer() {
    }

    public Customer(String fname, String lname, String email, String phone, String password, String street, String city, String state, String zip) {
        super(fname, lname, email, phone, password, street, city, state, zip);
    }    

    public void addBooking(Booking booking){
        this.bookings.add(booking);
    }
    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
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
