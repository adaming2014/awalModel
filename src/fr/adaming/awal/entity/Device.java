package fr.adaming.awal.entity;
// Generated 29 sept. 2014 16:10:20 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Device generated by hbm2java
 */
public class Device  implements java.io.Serializable {


     private Integer idDevice;
     private Modele modele;
     private Client client;
     private String description;
     private Set deviceinsurances = new HashSet(0);
     private Set devicerepairs = new HashSet(0);

    public Device() {
    }

    public Device(Modele modele, Client client, String description, Set deviceinsurances, Set devicerepairs) {
       this.modele = modele;
       this.client = client;
       this.description = description;
       this.deviceinsurances = deviceinsurances;
       this.devicerepairs = devicerepairs;
    }
   
    public Integer getIdDevice() {
        return this.idDevice;
    }
    
    public void setIdDevice(Integer idDevice) {
        this.idDevice = idDevice;
    }
    public Modele getModele() {
        return this.modele;
    }
    
    public void setModele(Modele modele) {
        this.modele = modele;
    }
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set getDeviceinsurances() {
        return this.deviceinsurances;
    }
    
    public void setDeviceinsurances(Set deviceinsurances) {
        this.deviceinsurances = deviceinsurances;
    }
    public Set getDevicerepairs() {
        return this.devicerepairs;
    }
    
    public void setDevicerepairs(Set devicerepairs) {
        this.devicerepairs = devicerepairs;
    }




}


