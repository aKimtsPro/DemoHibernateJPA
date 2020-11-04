package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
public class Commande implements Serializable {

    @EmbeddedId // edition_id / librairie_id
    private CommandeId commandeId = new CommandeId();

    @Column
    private LocalDate dateCommande;

    @ManyToOne
    @JoinColumn(name = "edition_id")
    @MapsId("edition_id")
    private Edition edition;

    @ManyToOne
    @JoinColumn(name = "librairie_id")
    @MapsId("librairie_id")
    private Librairie librairie;

    public CommandeId getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(CommandeId commandeId) {
        this.commandeId = commandeId;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }

    public Librairie getLibrairie() {
        return librairie;
    }

    public void setLibrairie(Librairie librairie) {
        this.librairie = librairie;
    }
}
