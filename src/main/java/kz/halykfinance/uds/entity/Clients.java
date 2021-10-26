package kz.halykfinance.uds.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Optional;

@Entity
//@Table(name = "clients")
public class Clients {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private Long id;

//    @Column(name = "iin", unique = true,nullable = false)
    private Integer iin;
    //    @Column(name = "fio",nullable = false)
    private String fio;
    //    @Column(name = "number",nullable = false)
    private Integer number;

    public Clients(){}

    public Clients(Long id, Integer iin, String fio, Integer number) {
        this.id = id;
        this.iin = iin;
        this.fio = fio;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIin() {
        return iin;
    }

    public void setIin(Integer iin) {
        this.iin = iin;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
