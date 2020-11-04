import entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main2 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibrairieUnit");
        EntityManager em = emf.createEntityManager();


        Edition edition = em.find(Edition.class,3);
        Librairie lib = em.find(Librairie.class,3);

        em.getTransaction().begin();

        Commande cmd = new Commande();
        cmd.setEdition(edition);
        cmd.setLibrairie(lib);
        cmd.setDateCommande(LocalDate.now());

        em.persist(cmd);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
