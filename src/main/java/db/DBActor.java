package db;

import models.films.Film;
import models.people.Actor;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBActor {

    private static Session session;

    public static List<Film> allFilmsWithActor(Actor actor) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Film> films = null;
        try {
            Criteria cr = session.createCriteria(Film.class);
            cr.createAlias("cast", "actor");
            cr.add(Restrictions.eq("actor.id", actor.getId()));
            films = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return films;
    }
}
