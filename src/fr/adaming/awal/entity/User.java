package fr.adaming.awal.entity;
// Generated 2 oct. 2014 13:35:35 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

    private Integer idUser;
    private String firstname;
    private String lastname;
    private String mail;
    private String password;
    private String phone;
    private Set resellers = new HashSet(0);
    private Set clients = new HashSet(0);
    private Set admins = new HashSet(0);
    private Set repairers = new HashSet(0);

    public User() {
    }

    public User(String firstname, String lastname, String mail, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.password = password;
    }

    public User(String firstname, String lastname, String mail, String password, String phone, Set resellers, Set clients, Set admins, Set repairers) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.password = password;
        this.phone = phone;
        this.resellers = resellers;
        this.clients = clients;
        this.admins = admins;
        this.repairers = repairers;
    }

    public Integer getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set getResellers() {
        return this.resellers;
    }

    public void setResellers(Set resellers) {
        this.resellers = resellers;
    }

    public Set getClients() {
        return this.clients;
    }

    public void setClients(Set clients) {
        this.clients = clients;
    }

    public Set getAdmins() {
        return this.admins;
    }

    public void setAdmins(Set admins) {
        this.admins = admins;
    }

    public Set getRepairers() {
        return this.repairers;
    }

    public void setRepairers(Set repairers) {
        this.repairers = repairers;
    }

}
