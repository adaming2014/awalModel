package fr.adaming.awal.entity;
// Generated 8 oct. 2014 14:22:13 by Hibernate Tools 4.3.1


import fr.adaming.awal.entity.interfaces.IUser;
import java.util.HashSet;
import java.util.Set;

/**
 * Repairer generated by hbm2java
 */
public class Repairer  implements IUser<Integer> {


     private Integer idRepairer;
     private Address address;
     private Firm firm;
     private User user;
     private String available;
     private Set devicerepairs = new HashSet(0);
     private Set competences = new HashSet(0);

    public Repairer() {
    }

	
    public Repairer(User user, String available) {
        this.user = user;
        this.available = available;
    }
    public Repairer(Address address, Firm firm, User user, String available, Set devicerepairs, Set competences) {
       this.address = address;
       this.firm = firm;
       this.user = user;
       this.available = available;
       this.devicerepairs = devicerepairs;
       this.competences = competences;
    }
   
    public Integer getIdRepairer() {
        return this.idRepairer;
    }
    
    public void setIdRepairer(Integer idRepairer) {
        this.idRepairer = idRepairer;
    }
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    public Firm getFirm() {
        return this.firm;
    }
    
    public void setFirm(Firm firm) {
        this.firm = firm;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getAvailable() {
        return this.available;
    }
    
    public void setAvailable(String available) {
        this.available = available;
    }
    public Set getDevicerepairs() {
        return this.devicerepairs;
    }
    
    public void setDevicerepairs(Set devicerepairs) {
        this.devicerepairs = devicerepairs;
    }
    public Set getCompetences() {
        return this.competences;
    }
    
    public void setCompetences(Set competences) {
        this.competences = competences;
    }

    @Override
    public Integer getId() {
        return idRepairer;
    }




}


