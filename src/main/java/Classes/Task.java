package Classes;

import java.util.Date;

public class Task {
    private int id;
    private String libelle;
    private Date dateRéalisation;
    private double prixHeure;
    private String supervisor ;

    public Task(int id, String libelle, Date dateRéalisation, double prixHeure) {
        this.id = id;
        this.libelle = libelle;
        this.dateRéalisation = dateRéalisation;
        this.prixHeure = prixHeure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateRéalisation() {
        return dateRéalisation;
    }

    public void setDateRéalisation(Date dateRéalisation) {
        this.dateRéalisation = dateRéalisation;
    }

    public double getPrixHeure() {
        return prixHeure;
    }

    public void setPrixHeure(double prixHeure) {
        this.prixHeure = prixHeure;
    }

    @Override
    public String toString() {
        return "Task{id=" + id + ", libelle='" + libelle + "', dateRéalisation=" + dateRéalisation + ", prixHeure=" + prixHeure + "}";
    }
}

