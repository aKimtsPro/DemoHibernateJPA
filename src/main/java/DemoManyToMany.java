

import entity.Course;
import entity.Participation;
import entity.Pilote;
import entity.Voiture;

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

//        Course course = new Course();
//        course.setLongueur(500);
//        course.setNbrTours(5);
//
//        em.persist(course);
//
//        Participation part = em.find(Participation.class, 1);
//
//        if(course.getParticipations() == null)
//            course.setParticipations(new ArrayList<>());
//        course.getParticipations().add(part);


        Course course = em.find(Course.class, 2);

        Pilote p = new Pilote();
        p.setName("marie");
        p.setSponsor("bipboop");

        em.persist(p);

        Voiture v = new Voiture();
        v.setMarque("bipboop");
        v.setModele("polabam");

        em.persist(v);

        Participation part = new Participation();
        part.setPilote(p);
        part.setVoiture(v);

        em.persist(part);

        if(course.getParticipations() == null)
            course.setParticipations(new ArrayList<>());
        course.getParticipations().add(part);


        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
