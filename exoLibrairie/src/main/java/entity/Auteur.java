package entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auteur")
    private int id;

    @Column(name = "nom_auteur", nullable = false)
    private String nom;

    @Column(name = "prenom_auteur")
    private String prenom;

    @Column(name = "pseudo_auteur", nullable = true)
    private String pseudo;

    @ManyToMany(mappedBy = "auteurs")
    private Collection<Livre> oeuvre;
}
