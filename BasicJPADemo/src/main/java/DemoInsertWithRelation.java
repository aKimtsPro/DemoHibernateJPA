import entity.Participation;
import entity.Pilote;
import entity.Voiture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DemoInsertWithRelation {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceDemo");
        EntityManager em = emf.createEntityManager();

        // Participation ManyToOne

        em.getTransaction().begin();

        Voiture v = new Voiture();
        v.setMarque("vroom");
        v.setModele("bip");

        em.persist(v);


        Pilote p = new Pilote();
        p.setName("luc");
        p.setSponsor("vroom");

        em.persist(p);


        Participation part = new Participation();
        part.setVoiture(v);
        part.setPilote(p);

        em.persist(part);

        // OneToOne Pilote<->Voiture
        p.setVoiture(v);


        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
