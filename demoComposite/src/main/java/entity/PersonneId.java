package entity;

import java.io.Serializable;
import java.util.Objects;

public class PersonneId implements Serializable {

    private String nom;
    private String prenom;

    public PersonneId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonneId that = (PersonneId) o;
        return nom.equals(that.nom) &&
                prenom.equals(that.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom);
    }

    public PersonneId(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
