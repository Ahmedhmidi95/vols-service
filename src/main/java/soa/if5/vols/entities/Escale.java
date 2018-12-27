package soa.if5.vols.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
public class Escale implements Serializable {

    @Id
    private Long idEscale;

    @Column(name = "h_dep")
    private Time hDep;

    @Column(name = "h_arr")
    private Time hArr;

    public Escale() {
    }
    public Escale(Long idEscale, Time hDep, Time hArr) {
        this.idEscale = idEscale;
        this.hDep = hDep;
        this.hArr = hArr;
    }

    public Long getIdEscale() {
        return idEscale;
    }
    public void setIdEscale(Long idEscale) {
        this.idEscale = idEscale;
    }

    public Time gethDep() {
        return hDep;
    }
    public void sethDep(Time hDep) {
        this.hDep = hDep;
    }

    public Time gethArr() {
        return hArr;
    }
    public void sethArr(Time hArr) {
        this.hArr = hArr;
    }
}
