package fr.adaming.awal.entity;
// Generated 29 sept. 2014 16:10:20 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Firm generated by hbm2java
 */
public class Firm  implements java.io.Serializable {


     private Integer idFirm;
     private Address address;
     private String name;
     private String phone;
     private String logoPath;
     private String cssPath;
     private Set resellers = new HashSet(0);

    public Firm() {
    }
    public Firm( Address address, String name, String phone, String logoPath, String cssPath) {
        this.address = address;
        this.name = name;
        this.phone = phone;
        this.logoPath = logoPath;
        this.cssPath = cssPath;
    }
    public Firm(Integer idFirm, Address address, String name, String phone, String logoPath, String cssPath) {
        this.idFirm = idFirm;
        this.address = address;
        this.name = name;
        this.phone = phone;
        this.logoPath = logoPath;
        this.cssPath = cssPath;
    }

    public Firm(Address address, String name, String phone, String logoPath, String cssPath, Set resellers) {
       this.address = address;
       this.name = name;
       this.phone = phone;
       this.logoPath = logoPath;
       this.cssPath = cssPath;
       this.resellers = resellers;
    }
   
    public Integer getIdFirm() {
        return this.idFirm;
    }
    
    public void setIdFirm(Integer idFirm) {
        this.idFirm = idFirm;
    }
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getLogoPath() {
        return this.logoPath;
    }
    
    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }
    public String getCssPath() {
        return this.cssPath;
    }
    
    public void setCssPath(String cssPath) {
        this.cssPath = cssPath;
    }
    public Set getResellers() {
        return this.resellers;
    }
    
    public void setResellers(Set resellers) {
        this.resellers = resellers;
    }




}


