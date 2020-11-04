package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "pilote")
public class Pilote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pilote_id")
    private int id;

    @Column(name = "pilote_name")
    private String name;

    @Column(name = "pilote_sponsor")
    private String sponsor;

    @OneToOne
    private Voiture voiture;

    @OneToMany(mappedBy = "pilote")
    private Collection<Participation> participations = new ArrayList<>();


    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
}
