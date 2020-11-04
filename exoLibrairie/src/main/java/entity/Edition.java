package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Table
public class Edition  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_edition")
    private int id;

    @Column(name = "date_edition")
    private LocalDate dateEdition;

    @Column(name = "ordre_edition")
    private int ordre;

    @Column(name = "prix_vente")
    private double prix;

    @Column(name = "nbr_exemplaire")
    private int nbrExemplaire;

    @ManyToOne
    @JoinColumn(name = "livre_edite")
    private Livre livre;

//    @ManyToMany(mappedBy = "commandes")
//    private Collection<Librairie> commanditaires;

    @OneToMany(mappedBy = "edition")
    private Collection<Commande> commandes;

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateEdition() {
        return dateEdition;
    }

    public void setDateEdition(LocalDate dateEdition) {
        this.dateEdition = dateEdition;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNbrExemplaire() {
        return nbrExemplaire;
    }

    public void setNbrExemplaire(int nbrExemplaire) {
        this.nbrExemplaire = nbrExemplaire;
    }
}
