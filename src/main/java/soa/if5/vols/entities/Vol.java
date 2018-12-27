package soa.if5.vols.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class Vol  implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_vol")
    private Long idVol;

    @Column(name = "num_vol")
    private Long numVol;

    private Date date;

    @Column(name = "h_dep")
    private Time hDep;

    @Column(name = "h_arr")
    private Time hArr;

    private String dep;

    private String arr;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(targetEntity = Airline.class, fetch = FetchType.LAZY)
    private Airline airline;

    private String classe;

    @OneToMany(mappedBy = "idEscale", fetch = FetchType.LAZY)
    private List<Escale> escales;

    public Long getIdVol() {
        return idVol;
    }
    public void setIdVol(Long idVol) {
        this.idVol = idVol;
    }

    public Vol() {
    }
    public Vol(Long numVol,
               Date date,
               Time hDep,
               Time hArr,
               String dep,
               String arr,
               Airline airline,
               String classe,
               List<Escale> escales)
    {
        this.numVol = numVol;
        this.date = date;
        this.hDep = hDep;
        this.hArr = hArr;
        this.dep = dep;
        this.arr = arr;
        this.airline = airline;
        this.classe = classe;
        this.escales = escales;
    }

    public Long getNumVol() {
        return numVol;
    }
    public void setNumVol(Long numVol) {
        this.numVol = numVol;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
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

    public String getDep() {
        return dep;
    }
    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getArr() {
        return arr;
    }
    public void setArr(String arr) {
        this.arr = arr;
    }

    public Airline getAirline() {
        return airline;
    }
    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }

    public List<Escale> getEscales() {
        return escales;
    }
    public void setEscales(List<Escale> escales) {
        this.escales = escales;
    }
}
