package db;

import models.films.Film;
import models.studios.Studio;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBStudio {

    private static Session session;

    public static List<Film> allFilmsFromStudio(Studio studio) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Film> films = null;
        try {
            Criteria cr = session.createCriteria(Film.class);
            cr.add(Restrictions.eq("studio", studio));
            films = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return films;
    }
}
