package entity;

import javax.persistence.Embeddable;

@Embeddable
public class CommandeId {

    private int edition_id;
    private int libraire_id;

    public int getEdition_id() {
        return edition_id;
    }

    public void setEdition_id(int edition_id) {
        this.edition_id = edition_id;
    }

    public int getLibraire_id() {
        return libraire_id;
    }

    public void setLibraire_id(int libraire_id) {
        this.libraire_id = libraire_id;
    }
}
