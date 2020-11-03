package entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class Livre {

    @Id
    private String isbn;

    @Column(name = "livre_titre")
    private String titre;

    @OneToMany(mappedBy = "livre")
    private Collection<Edition> editions;

    @ManyToMany
    @JoinTable(
            name = "a_ecrit",
            joinColumns = {@JoinColumn(name = "livre_isbn")},
            inverseJoinColumns = {@JoinColumn(name = "auteur_id")}
    )
    private Collection<Auteur> auteurs;


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNom() {
        return titre;
    }

    public void setNom(String nom) {
        this.titre = nom;
    }
}
