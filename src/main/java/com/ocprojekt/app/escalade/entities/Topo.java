package com.ocprojekt.app.escalade.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Topo implements Serializable {

    @Id
    @GeneratedValue
    private int idTopo;
    @NotNull
    @Size(min = 4, max = 50)
    private String nomTopo;
    @NotNull
    @Size(min = 4, max = 250)
    private String descriptionTopo;
    private String nomProprietaire;
    private Boolean isLoan;
    @ManyToOne
    @JoinColumn(name = "username")
    private User user;
    @OneToMany(mappedBy = "topo", fetch = FetchType.LAZY)
    private Collection<Pret> prets;

    public Topo() {
        super();
    }

    public Topo(@NotNull @Size(min = 4, max = 50) String nomTopo,
                @NotNull @Size(min = 4, max = 250) String descriptionTopo,
                String nomProprietaire, Boolean isLoan, User user) {
        this.nomTopo = nomTopo;
        this.descriptionTopo = descriptionTopo;
        this.nomProprietaire = nomProprietaire;
        this.isLoan = isLoan;
        this.user = user;
    }

    public int getIdTopo() {
        return idTopo;
    }

    public void setIdTopo(int idTopo) {
        this.idTopo = idTopo;
    }

    public String getNomTopo() {
        return nomTopo;
    }

    public void setNomTopo(String nomTopo) {
        this.nomTopo = nomTopo;
    }

    public String getDescriptionTopo() {
        return descriptionTopo;
    }

    public void setDescriptionTopo(String descriptionTopo) {
        this.descriptionTopo = descriptionTopo;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public Boolean getLoan() {
        return isLoan;
    }

    public void setLoan(Boolean loan) {
        isLoan = loan;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
