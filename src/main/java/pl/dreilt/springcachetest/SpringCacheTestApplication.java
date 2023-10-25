package pl.dreilt.springcachetest;

import pl.dreilt.springcachetest.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SpringCacheTestApplication {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("spring-cache-test");

    public static void main(String[] args) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        User userToSave = new User();
        userToSave.setId(1L);
        userToSave.setFirstname("Patryk");
        userToSave.setLastname("Depka");
        userToSave.setAge(28L);

        em.persist(userToSave);
        em.getTransaction().commit();
        em.close();

        em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, 1L);
        System.out.println(user);
        em.getTransaction().commit();
        em.close();

        em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        user = em.find(User.class, 1L);
        System.out.println(user);
        em.getTransaction().commit();
        em.close();
    }

}
