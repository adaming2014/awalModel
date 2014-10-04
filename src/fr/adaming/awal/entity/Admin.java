package fr.adaming.awal.entity;
// Generated 2 oct. 2014 13:35:35 by Hibernate Tools 4.3.1

import fr.adaming.awal.entity.interfaces.IUser;

/**
 * Admin generated by hbm2java
 */
public class Admin implements IUser<Integer> {

    private Integer idAdmin;
    private User user;

    public Admin() {
    }

    public Admin(User user) {
        this.user = user;
    }

    @Override
    public Integer getId() {
        return this.idAdmin;
    }

    public Integer getIdAdmin() {
        return this.idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
