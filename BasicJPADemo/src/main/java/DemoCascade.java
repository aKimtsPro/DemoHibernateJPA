import entity.Participation;
import entity.Pilote;
import entity.Voiture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DemoCascade {

    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("PersistenceDemo");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();


        Pilote p = new Pilote();
        p.setName("luc");

        Voiture v = new Voiture();
        v.setModele("vroomMobile");

        em.persist(v);

        Participation part= new Participation();
        part.setVoiture(v);
        part.setPilote(p);

        em.persist(part);


        em.getTransaction().commit();

        em.close();
        emf.close();

    }

}
