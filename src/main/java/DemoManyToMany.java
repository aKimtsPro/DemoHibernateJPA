

import entity.Course;
import entity.Participation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DemoManyToMany {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceDemo");
        EntityManager em  = emf.createEntityManager();

        em.getTransaction().begin();

        Course course = new Course();
        course.setLongueur(500);
        course.setNbrTours(5);

        em.persist(course);

        Participation part = em.find(Participation.class, 1);

        Collection<Participation> listPart = new ArrayList<>();
        listPart.add(part);

        course.setParticipations(listPart);



        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
