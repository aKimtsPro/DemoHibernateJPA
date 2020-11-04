import entity.Voiture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DemoCRUD_JPA {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("PersistenceDemo");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // insert
        Voiture voitToInsert = new Voiture();
        voitToInsert.setMarque("vroomMobile");
        voitToInsert.setModele("vrimvroom");

        em.persist(voitToInsert);

        // getById
        Voiture v = em.find(Voiture.class, 1);
        System.out.println(v.getId() +"\t"+ v.getMarque() +"\t"+ v.getModele() );

        //update
        v.setModele("Bip-Bip");
        v.setMarque("Vroom-Mobile");
        em.flush(); // reactualisation des entités

        //delete
        em.remove(v);

        em.getTransaction().commit(); // mise en place des modifs
        // em.getTransaction().rollback(); // annulation des modifs


        // on ferme d'abord le manager puis la factory
        em.close();
        emf.close();

    }

}
