package soa.if5.vols.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Airline implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_airline")
    private Long idAirline;
    private String name;

    public Airline() {
    }
    public Airline(String name) {
        this.name = name;
    }

    public Long getIdAirline() {
        return idAirline;
    }
    public void setIdAirline(Long idAirline) {
        this.idAirline = idAirline;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}