package com.Stock.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "Stock")

public class Stock implements Serializable {

    public Stock() {super();
    }
    public Stock(Long idstock, String numstock, Long nbrcopie, Float cout_achat) {
        this.idstock = idstock;
        this.numstock = numstock;
        this.nbrcopie = nbrcopie;
        this.cout_achat = cout_achat;
    }
    @Id
    @GeneratedValue
    private Long idstock;



    private String numstock;
    private Long nbrcopie;

    private Float cout_achat;
    public Long getIdstock() {
        return idstock;
    }

    public void setIdstock(Long idstock) {
        this.idstock = idstock;
    }

    public String getNumstock() {
        return numstock;
    }

    public void setNumstock(String numstock) {
        this.numstock = numstock;
    }

    public Long getNbrcopie() {
        return nbrcopie;
    }

    public void setNbrcopie(Long nbrcopie) {
        this.nbrcopie = nbrcopie;
    }

    public Float getCout_achat() {
        return cout_achat;
    }

    public void setCout_achat(Float cout_achat) {
        this.cout_achat = cout_achat;
    }



}
