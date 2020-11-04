package entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RecetteId implements Serializable {

    private String titre;
    private String nomAuteur;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecetteId recetteId = (RecetteId) o;
        return Objects.equals(titre, recetteId.titre) &&
                Objects.equals(nomAuteur, recetteId.nomAuteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, nomAuteur);
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }
}
