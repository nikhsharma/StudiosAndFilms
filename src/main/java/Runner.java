import com.sun.xml.internal.ws.api.ha.StickyFeature;
import db.DBActor;
import db.DBFilm;
import db.DBHelper;
import models.films.Film;
import models.films.Genre;
import models.people.Actor;
import models.people.Director;
import models.people.Person;
import models.studios.Studio;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Studio studio1 = new Studio("Universal Pictures", 1000000);
        DBHelper.save(studio1);

        Director director1 = new Director("Steven Spielberg");
        DBHelper.save(director1);

        Film film1 = new Film("Jurassic Park", Genre.THRILLER, studio1, director1);
        DBHelper.save(film1);

        Actor actor1 = new Actor("Jeff Goldblum", 300000);
        DBHelper.save(actor1);



        List<Studio> allStudios = DBHelper.getAll(Studio.class);
        List<Person> allPeople = DBHelper.getAll(Person.class);
        List<Film> allFilms = DBHelper.getAll(Film.class);

        DBHelper.addActorToFilm(actor1, film1);

        List<Actor> allActorsInFilm = DBFilm.allCastInFilm(film1);
        List<Film> allFilmsWithActor = DBActor.allFilmsWithActor(actor1);
    }
}
