/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author gizachew
 */



@Entity
@DiscriminatorValue("admin")
public class Administrator extends Account{

    public Administrator() {
    }

    public Administrator(String fname, String lname, String email, String phone, String password, String street, String city, String state, String zip) {
        super(fname, lname, email, phone, password, street, city, state, zip);
    }   
}
/*
@Entity
@Inheritance(discriminatorValue="A")
public class Administrator extends Account {

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
        if (!(object instanceof Administrator)) {
            return false;
        }
        Administrator other = (Administrator) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Administrator[ id=" + id + " ]";
    }
    
}
*/
