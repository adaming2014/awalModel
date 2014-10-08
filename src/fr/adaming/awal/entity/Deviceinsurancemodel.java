package fr.adaming.awal.entity;
// Generated 8 oct. 2014 14:22:13 by Hibernate Tools 4.3.1


import fr.adaming.awal.entity.interfaces.IEntity;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Deviceinsurancemodel generated by hbm2java
 */
public class Deviceinsurancemodel  implements IEntity<Integer> {


     private Integer idDeviceinsurancemodel;
     private Modele modele;
     private String name;
     private String description;
     private int duration;
     private int price;
     private Set deviceinsurances = new HashSet(0);

    public Deviceinsurancemodel() {
    }

	
    public Deviceinsurancemodel(Modele modele, String name, int duration, int price) {
        this.modele = modele;
        this.name = name;
        this.duration = duration;
        this.price = price;
    }
    public Deviceinsurancemodel(Modele modele, String name, String description, int duration, int price, Set deviceinsurances) {
       this.modele = modele;
       this.name = name;
       this.description = description;
       this.duration = duration;
       this.price = price;
       this.deviceinsurances = deviceinsurances;
    }
   
    public Integer getIdDeviceinsurancemodel() {
        return this.idDeviceinsurancemodel;
    }
    
    public void setIdDeviceinsurancemodel(Integer idDeviceinsurancemodel) {
        this.idDeviceinsurancemodel = idDeviceinsurancemodel;
    }
    public Modele getModele() {
        return this.modele;
    }
    
    public void setModele(Modele modele) {
        this.modele = modele;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public int getDuration() {
        return this.duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    public Set getDeviceinsurances() {
        return this.deviceinsurances;
    }
    
    public void setDeviceinsurances(Set deviceinsurances) {
        this.deviceinsurances = deviceinsurances;
    }

    @Override
    public Integer getId() {
        return idDeviceinsurancemodel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Deviceinsurancemodel other = (Deviceinsurancemodel) obj;
        if (!Objects.equals(this.idDeviceinsurancemodel, other.idDeviceinsurancemodel)) {
            return false;
        }
        return true;
    }




}


