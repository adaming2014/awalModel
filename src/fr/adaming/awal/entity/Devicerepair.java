package fr.adaming.awal.entity;
// Generated 29 sept. 2014 16:10:20 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Devicerepair generated by hbm2java
 */
public class Devicerepair  implements java.io.Serializable {


     private Integer idDeviceRepair;
     private Repairer repairer;
     private Modelpackage modelpackage;
     private Device device;
     private String description;
     private Integer price;
     private String state;
     private Date dateCreation;
     private Date dateInRepair;
     private Date dateRepair;
     private Date dateClosed;

    public Devicerepair() {
    }

    public Devicerepair(Repairer repairer, Modelpackage modelpackage, Device device, String description, Integer price, String state, Date dateCreation, Date dateInRepair, Date dateRepair, Date dateClosed) {
       this.repairer = repairer;
       this.modelpackage = modelpackage;
       this.device = device;
       this.description = description;
       this.price = price;
       this.state = state;
       this.dateCreation = dateCreation;
       this.dateInRepair = dateInRepair;
       this.dateRepair = dateRepair;
       this.dateClosed = dateClosed;
    }
   
    public Integer getIdDeviceRepair() {
        return this.idDeviceRepair;
    }
    
    public void setIdDeviceRepair(Integer idDeviceRepair) {
        this.idDeviceRepair = idDeviceRepair;
    }
    public Repairer getRepairer() {
        return this.repairer;
    }
    
    public void setRepairer(Repairer repairer) {
        this.repairer = repairer;
    }
    public Modelpackage getModelpackage() {
        return this.modelpackage;
    }
    
    public void setModelpackage(Modelpackage modelpackage) {
        this.modelpackage = modelpackage;
    }
    public Device getDevice() {
        return this.device;
    }
    
    public void setDevice(Device device) {
        this.device = device;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public Date getDateCreation() {
        return this.dateCreation;
    }
    
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    public Date getDateInRepair() {
        return this.dateInRepair;
    }
    
    public void setDateInRepair(Date dateInRepair) {
        this.dateInRepair = dateInRepair;
    }
    public Date getDateRepair() {
        return this.dateRepair;
    }
    
    public void setDateRepair(Date dateRepair) {
        this.dateRepair = dateRepair;
    }
    public Date getDateClosed() {
        return this.dateClosed;
    }
    
    public void setDateClosed(Date dateClosed) {
        this.dateClosed = dateClosed;
    }




}


