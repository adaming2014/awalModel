package fr.adaming.awal.entity;
// Generated 9 oct. 2014 14:54:37 by Hibernate Tools 4.3.1

import fr.adaming.awal.entity.interfaces.IEntity;

/**
 * Competence generated by hbm2java
 */
public class Competence implements IEntity<Integer> {

    private Integer idCompetence;
    private Repairer repairer;
    private String type;

    public Competence() {
    }

    public Competence(Repairer repairer, String type) {
        this.repairer = repairer;
        this.type = type;
    }

    public Integer getIdCompetence() {
        return this.idCompetence;
    }

    public void setIdCompetence(Integer idCompetence) {
        this.idCompetence = idCompetence;
    }

    public Repairer getRepairer() {
        return this.repairer;
    }

    public void setRepairer(Repairer repairer) {
        this.repairer = repairer;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Integer getId() {
        return idCompetence;
    }

    @Override
    public void setId(Integer id) {
        this.idCompetence = id;
    }

}
