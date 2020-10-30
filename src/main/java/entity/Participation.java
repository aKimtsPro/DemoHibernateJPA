package entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class Participation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "participation_id")
    private int id;

    @ManyToOne
    private Pilote pilote;

    @ManyToOne
    private Voiture voiture;

    @ManyToMany(mappedBy = "participations")
    private Collection<Course> courses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pilote getPilote() {
        return pilote;
    }

    public void setPilote(Pilote pilote) {
        this.pilote = pilote;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
}
