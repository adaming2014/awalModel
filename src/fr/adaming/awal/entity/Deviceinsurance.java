package fr.adaming.awal.entity;
// Generated 9 oct. 2014 14:54:37 by Hibernate Tools 4.3.1

import fr.adaming.awal.entity.interfaces.IEntity;
import java.util.Date;

/**
 * Deviceinsurance generated by hbm2java
 */
public class Deviceinsurance implements IEntity<Integer> {

    private Integer idDeviceInsurance;
    private Device device;
    private Deviceinsurancemodel deviceinsurancemodel;
    private Date beginDate;
    private String description;
    private Date endDate;

    public Deviceinsurance() {
    }

    public Deviceinsurance(Device device, Deviceinsurancemodel deviceinsurancemodel, Date beginDate) {
        this.device = device;
        this.deviceinsurancemodel = deviceinsurancemodel;
        this.beginDate = beginDate;
    }

    public Deviceinsurance(Device device, Deviceinsurancemodel deviceinsurancemodel, Date beginDate, String description, Date endDate) {
        this.device = device;
        this.deviceinsurancemodel = deviceinsurancemodel;
        this.beginDate = beginDate;
        this.description = description;
        this.endDate = endDate;
    }

    public Integer getIdDeviceInsurance() {
        return this.idDeviceInsurance;
    }

    public void setIdDeviceInsurance(Integer idDeviceInsurance) {
        this.idDeviceInsurance = idDeviceInsurance;
    }

    public Device getDevice() {
        return this.device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Deviceinsurancemodel getDeviceinsurancemodel() {
        return this.deviceinsurancemodel;
    }

    public void setDeviceinsurancemodel(Deviceinsurancemodel deviceinsurancemodel) {
        this.deviceinsurancemodel = deviceinsurancemodel;
    }

    public Date getBeginDate() {
        return this.beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public Integer getId() {
        return idDeviceInsurance;
    }

}
