package fr.adaming.awal.entity;
// Generated 2 oct. 2014 10:20:58 by Hibernate Tools 4.3.1

import java.io.Serializable;
import java.util.Date;

/**
 * Deviceinsurance generated by hbm2java
 */
public class Deviceinsurance implements Serializable {

    private int idDeviceInsurance;
    private Device device;
    private Date beginDate;
    private Date endDate;
    private String description;

    public Deviceinsurance() {
    }

    public Deviceinsurance(int idDeviceInsurance) {
        this.idDeviceInsurance = idDeviceInsurance;
    }

    public Deviceinsurance(int idDeviceInsurance, Device device, Date beginDate, Date endDate, String description) {
        this.idDeviceInsurance = idDeviceInsurance;
        this.device = device;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.description = description;
    }

    public int getIdDeviceInsurance() {
        return this.idDeviceInsurance;
    }

    public void setIdDeviceInsurance(int idDeviceInsurance) {
        this.idDeviceInsurance = idDeviceInsurance;
    }

    public Device getDevice() {
        return this.device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Date getBeginDate() {
        return this.beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
