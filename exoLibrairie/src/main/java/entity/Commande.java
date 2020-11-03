package entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Commande {

    @EmbeddedId
    private CommandeId commandeId;

    @Column
    private LocalDate dateCommande;
}
