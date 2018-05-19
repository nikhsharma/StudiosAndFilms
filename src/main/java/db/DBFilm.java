package db;

import models.films.Film;
import models.people.Actor;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;
import java.util.Set;

public class DBFilm {

    private static Session session;

    public static List<Actor> allCastInFilm(Film film) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Actor> actors = null;
        try {
            Criteria cr = session.createCriteria(Actor.class);
            cr.createAlias("films", "film");
            cr.add(Restrictions.eq("film.id", film.getId()));
            actors = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return actors;
    }
}
