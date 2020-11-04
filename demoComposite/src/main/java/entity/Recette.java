package entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Recette {

    @EmbeddedId
    private RecetteId recetteId;

    @Column
    private String description;

    public RecetteId getRecetteId() {
        return recetteId;
    }

    public void setRecetteId(RecetteId recetteId) {
        this.recetteId = recetteId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
