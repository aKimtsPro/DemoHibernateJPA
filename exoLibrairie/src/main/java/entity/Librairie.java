package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table
public class Librairie  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_librairie")
    private int id;

    @Column(name = "nom_libraire")
    private String nom;

    @Column(name = "rue_libraire")
    private String rue;

    @Column(name = "numero_libraire")
    private int numero;

    @Column(name = "code_postal_libraire")
    private String codePostal;

    @Column(name = "ville_librairie", columnDefinition = "VARCHAR(40) default 'Charleroi'")
    private String ville;

//    @ManyToMany
//    @JoinTable(
//            name = "commande",
//            joinColumns = {@JoinColumn(name = "commenditaire_id")},
//            inverseJoinColumns = {@JoinColumn(name = "edition_id")}
//    )
//    private Collection<Edition> commandes;

    @OneToMany(mappedBy = "librairie")
    private Collection<Commande> commandes;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
